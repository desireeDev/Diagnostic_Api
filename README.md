
````markdown
# 🔹 Diagnostic API

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen?logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.9-blue?logo=apachemaven)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Build](https://img.shields.io/badge/build-passing-brightgreen)

API REST pour la gestion des **diagnostics clients**, développée avec **Spring Boot 3**, **Java 21**, et documentée via **Swagger / OpenAPI**.  

L’API est **testable via Swagger UI**, idéale pour les projets front-end ou pour des entretiens techniques.

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
````

2. Lancer l’application :

```bash
./mvnw spring-boot:run
```

3. Accéder à l’application :
   [http://localhost:8080](http://localhost:8080)

4. Accéder à **Swagger UI** pour tester tous les endpoints :
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 🗂️ Structure du projet

```
src/main/java/com/example/diagnostic/
├─ config/
│  └─ OpenApiConfig.java       # Configuration Swagger / OpenAPI
├─ controller/
│  └─ DiagnosticController.java
├─ dto/
│  └─ DiagnosticDTO.java       # Data Transfer Object
├─ model/
│  ├─ Diagnostic.java
│  └─ Status.java
├─ repository/
│  └─ DiagnosticRepository.java
├─ service/
│  └─ DiagnosticService.java
└─ DiagnosticApplication.java  # Classe principale
```

---

## 📌 Endpoints disponibles

| Méthode | URL                          | Description                             |
| ------- | ---------------------------- | --------------------------------------- |
| GET     | /api/diagnostics             | Récupérer tous les diagnostics          |
| GET     | /api/diagnostics/{id}        | Récupérer un diagnostic par ID          |
| POST    | /api/diagnostics             | Créer un nouveau diagnostic             |
| PUT     | /api/diagnostics/{id}/status | Mettre à jour le statut d’un diagnostic |
| DELETE  | /api/diagnostics/{id}        | Supprimer un diagnostic                 |

---

## 💾 Exemple de payload JSON

### Création d’un diagnostic

```json
{
  "clientName": "Client Dupont",
  "description": "Problème de connexion internet"
}
```

### Mise à jour du statut

```http
PUT /api/diagnostics/1/status?status=TERMINE
```

---

## 🌐 Swagger UI

Interface web pour **visualiser et tester tous les endpoints** :

![Swagger GIF](docs/swagger-demo.gif)

> Lien direct : [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

> 💡 **Astuce** : remplace `docs/swagger-demo.gif` par un GIF de ton Swagger en action (enregistrer avec ShareX ou LICEcap).

---

## ✅ Points forts

* Documentation **automatique via Swagger/OpenAPI**
* **DTO** pour sécuriser les échanges de données
* Architecture claire **Controller → Service → Repository**
* Base de données H2 intégrée pour tests rapides
* Projet prêt pour **entretien technique + démonstration**

---

## ⚡ Notes

* La base H2 est en mémoire et réinitialisée à chaque lancement
* Swagger UI permet de **tester l’API sans écrire de front**
* Projet modulable pour ajout de sécurité, JWT, ou front React/Angular

---

## 📄 License

MIT License - libre à utiliser et modifier.

```

---



Veux que je fasse ça ?
```
