#_author_: seth

# Use the official OpenJDK 17 base image with Alpine Linux
FROM maven:3.8.3-openjdk-17 as build
# Copy the JAR file from the target directory to the container at /app
COPY ../.. .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/realestate-0.0.1-SNAPSHOT.jar app.jar
# Expose the port that your Spring Boot application will run on
EXPOSE 8080
# Specify the command to run on container startup
ENTRYPOINT ["java", "-Xmx512m", "-jar", "/app.jar"]