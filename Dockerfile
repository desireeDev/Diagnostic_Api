# ----------------------------
# Étape 1 : Build Maven
# ----------------------------
FROM eclipse-temurin:23-jdk AS builder

# Dossier de travail dans le conteneur
WORKDIR /app

# Copie des fichiers Maven
COPY pom.xml .
COPY src ./src

# Build du projet avec Maven
RUN ./mvnw clean package -DskipTests

# ----------------------------
# Étape 2 : Image finale
# ----------------------------
FROM eclipse-temurin:23-jdk-jammy

# Dossier de travail
WORKDIR /app

# Copie du jar depuis l'étape builder
COPY --from=builder /app/target/diagnostic-api.jar app.jar

# Expose le port de l'application
EXPOSE 8080

# Commande de démarrage
ENTRYPOINT ["java", "-jar", "app.jar"]
