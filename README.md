# 🔹 Diagnostic API

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.9-blue?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Build](https://img.shields.io/badge/build-passing-brightgreen)

API REST pour la gestion des **diagnostics clients**, développée avec **Spring Boot 3**, **Java 21**, et documentée via **Swagger / OpenAPI**.  

L’API est **testable via Swagger UI**, idéale pour les projets front-end.

---

## 🚀 Fonctionnalités

- CRUD complet pour les diagnostics clients
- Mise à jour du statut d’un diagnostic (`EN_COURS`, `TERMINE`, `ERREUR`)
- Documentation automatique des endpoints avec Swagger
- DTO pour sécuriser les données exposées
- Architecture **Controller → Service → Repository**
- Base de données H2 en mémoire (idéal pour tests rapides)

---

## 🛠️ Technologies

- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**
- **Swagger / OpenAPI** (`springdoc-openapi-starter-webmvc-ui`)
- **Maven**

---

## ⚙️ Installation & Lancement

1. Cloner le projet :  
```bash
git clone <URL_DU_PROJET>
cd diagnostic-api
