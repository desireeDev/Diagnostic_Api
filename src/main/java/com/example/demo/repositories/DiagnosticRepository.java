package com.example.demo.repositories;

import com.example.demo.models.Diagnostic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository Spring Data JPA.
 * Fournit automatiquement les opérations CRUD.
 * La couche qui permet d'avoir accès à la base de donnée.
 */
public interface DiagnosticRepository extends JpaRepository<Diagnostic, Long> {
}
