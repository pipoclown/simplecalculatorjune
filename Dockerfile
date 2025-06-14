# Start from an official Java runtime
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy built JAR from host to image
COPY target/*.jar app.jar

# Set the entry point
ENTRYPOINT ["java", "-jar", "app.jar"]
