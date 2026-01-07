package com.example.demo.models;

import jakarta.persistence.*;

/**
 * Entité JPA représentant un diagnostic.
 * Cette classe correspond à une table en base de données.
 */
@Entity
@Table(name="diagnostic")
public class Diagnostic {

    /**
     * Identifiant unique du diagnostic.
     * Généré automatiquement par la base.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nom du client.
     */
    @Column(nullable = false)
    private String clientName;

    /**
     * Statut du diagnostic.
     * Enum stocké sous forme de texte.
     */
    @Enumerated(EnumType.STRING)
    private Status status;

    /**
     * Description du problème.
     */
    @Column(nullable=false)
    private String description;
    /**
     * Constructeur vide.
     */
    public Diagnostic() {}
    /**
     * Constructeur non vide.
     */
    public Diagnostic(String clientName, Status status, String description) {
        this.clientName = clientName;
        this.status = status;
        this.description = description;
    }

    // Getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

