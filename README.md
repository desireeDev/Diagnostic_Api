# 🔹 Diagnostic API

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.9-blue?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-lightgrey)


API REST pour la gestion des **diagnostics clients**, développée avec **Spring Boot 3**, **Java 23**, et documentée via **Swagger / OpenAPI**.  

L’API est **testable via Swagger UI**, idéale pour les projets front-end.

---

## 🚀 Fonctionnalités actuelles

- CRUD complet pour les diagnostics clients
- Mise à jour du statut d’un diagnostic (`EN_COURS`, `TERMINE`, `ERREUR`)
- Gestion des **exceptions personnalisées**
- Documentation automatique des endpoints avec Swagger
- DTO pour sécuriser les données exposées
- Architecture **Controller → Service → Repository**
- Base de données H2 en mémoire (idéal pour tests rapides)

---

## 🔮 Fonctionnalités prévues / à venir

- Tests de performance avec **JMeter**
- Qualité du code vérifiée avec **SonarLint**
- Monitoring de la performance en production avec **Dynatrace**

> Ces fonctionnalités montrent que le projet est **préparé pour la production** et la montée en charge future.

---

## 🛠️ Technologies

- **Java 23**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**
- **Swagger / OpenAPI** (`springdoc-openapi-starter-webmvc-ui`)
- **Maven**
- **Docker**

---

## ⚙️ Installation & Lancement

1. Cloner le projet :  
```bash
git clone <https://github.com/desireeDev/Diagnostic_Api.git>
cd diagnostic-api
