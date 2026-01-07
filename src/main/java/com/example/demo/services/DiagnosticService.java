package com.example.demo.services;



import com.example.demo.dto.DiagnosticDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.models.Diagnostic;
import com.example.demo.models.Status;
import com.example.demo.repositories.DiagnosticRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Couche service.
 * Contient toute la logique métier.
 */
@Service
public class DiagnosticService {

    /**
     * Repository injecté par constructeur (plus sur plus testable)
     * (injection de dépendance).
     */
    private final DiagnosticRepository repository;

    public DiagnosticService(DiagnosticRepository repository) {
        this.repository = repository;
    }

    /**
     * Conversion entité -> DTO.
     */
    private DiagnosticDTO toDTO(Diagnostic diagnostic) {
        return new DiagnosticDTO(
                diagnostic.getId(),
                diagnostic.getClientName(),
                diagnostic.getStatus(),
                diagnostic.getDescription()
        );
    }

    /**
     * Conversion DTO -> entité.
     */
    private Diagnostic toEntity(DiagnosticDTO dto) {
        return new Diagnostic(
                dto.getClientName(),
                dto.getStatus(),
                dto.getDescription()
        );
    }

    /**
     * Récupère tous les diagnostics.
     */
    public List<DiagnosticDTO> getAll() {
        return repository.findAll().stream().map(this::toDTO).toList();
    }

    /**
     * Récupère un diagnostic par ID.
     */
    public DiagnosticDTO getById(Long id) {
        Diagnostic diagnostic = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Diagnostic introuvable")
                );
        return toDTO(diagnostic);
    }

    /**
     * Crée un nouveau diagnostic.
     * Le statut est initialisé à EN_COURS.
     */
    public DiagnosticDTO create(DiagnosticDTO dto) {
        Diagnostic diagnostic = toEntity(dto);
        diagnostic.setStatus(Status.EN_COURS);
        return toDTO(repository.save(diagnostic));
    }

    /**
     * Met à jour le statut d’un diagnostic.
     */
    public DiagnosticDTO updateStatus(Long id, Status status) {
        Diagnostic diagnostic = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Diagnostic introuvable")
                );
        diagnostic.setStatus(status);
        return toDTO(repository.save(diagnostic));
    }

    /**
     * Supprime un diagnostic.
     */
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Diagnostic introuvable");
        }
        repository.deleteById(id);
    }
}
