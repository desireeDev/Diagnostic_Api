package com.example.demo.dto;

import com.example.demo.models.Status;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DTO (Data Transfer Object).
 * Utilisé pour échanger les données avec le front React.
 */
@Schema(description = "Objet représentant un diagnostic côté API")
public class DiagnosticDTO {

    private Long id;
    private String clientName;
    private Status status;
    private String description;

    public DiagnosticDTO() {}

    public DiagnosticDTO(Long id, String clientName, Status status, String description) {
        this.id = id;
        this.clientName = clientName;
        this.status = status;
        this.description = description;
    }

    /**
     * Obtient l'identifiant du diagnostic.
     * @return l'identifiant
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'identifiant du diagnostic.
     * @param id l'identifiant à définir
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtient le nom du client.
     * @return le nom du client
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Définit le nom du client.
     * @param clientName le nom du client à définir
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Obtient le statut du diagnostic.
     * @return le statut
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Définit le statut du diagnostic.
     * @param status le statut à définir
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Obtient la description du problème.
     * @return la description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la description du problème.
     * @param description la description à définir
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

