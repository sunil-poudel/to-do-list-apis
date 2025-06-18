# Use OpenJDK as base image
FROM eclipse-temurin:21-jdk-alpine

# Set app directory
WORKDIR /app

# Copy JAR file
COPY build/libs/*.jar to-do-list-0.0.1-SNAPSHOT.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]