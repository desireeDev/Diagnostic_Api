package com.example.demo.exception;



/**
 * Exception métier levée lorsqu’une ressource
 * n’est pas trouvée en base.
 * super used pour faire passer le message personnalisé à la classe parente.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
