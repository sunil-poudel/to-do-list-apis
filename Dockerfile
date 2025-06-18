# Use a JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Gradle files first (for caching)
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# Build the JAR
RUN ./gradlew clean build

# Run the JAR
CMD ["java", "-jar", "build/libs/to-do-list-0.0.1-SNAPSHOT.jar"]