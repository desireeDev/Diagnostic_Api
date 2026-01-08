package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * Gestion globale des exceptions de l’API.
 * Centralise toutes les erreurs.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Gestion des erreurs de type "ressource non trouvée".
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                Map.of(
                        "timestamp", LocalDateTime.now(),
                        "status", 404,
                        "message", ex.getMessage()
                )
        );
    }

    /**
     * Gestion des erreurs générales.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneric(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                Map.of(
                        "timestamp", LocalDateTime.now(),
                        "status", 500,
                        "message", "Erreur interne du serveur"
                )
        );
    }
}
