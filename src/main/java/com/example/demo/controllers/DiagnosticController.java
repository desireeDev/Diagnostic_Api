package com.example.demo.controllers;

import com.example.demo.dto.DiagnosticDTO;
import com.example.demo.models.Status;
import com.example.demo.services.DiagnosticService;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST.
 * Expose les endpoints HTTP.
 */
@RestController
@RequestMapping("/api/diagnostics")
@CrossOrigin("*")
@Tag(name = "Diagnostics", description = "Gestion des diagnostics clients")
public class DiagnosticController {

    private final DiagnosticService service;

    public DiagnosticController(DiagnosticService service) {
        this.service = service;
    }

    @Operation(summary = "Récupérer tous les diagnostics")
    @GetMapping
    public List<DiagnosticDTO> getAll() {
        return service.getAll();
    }

    @Operation(summary = "Récupérer un diagnostic par ID")
    @GetMapping("/{id}")
    public DiagnosticDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @Operation(summary = "Créer un diagnostic")
    @PostMapping
    public DiagnosticDTO create(@RequestBody DiagnosticDTO dto) {
        return service.create(dto);
    }

    @Operation(summary = "Mettre à jour le statut d’un diagnostic")
    @PutMapping("/{id}/status")
    public DiagnosticDTO updateStatus(
            @PathVariable Long id,
            @RequestParam Status status
    ) {
        return service.updateStatus(id, status);
    }

    @Operation(summary = "Supprimer un diagnostic")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
