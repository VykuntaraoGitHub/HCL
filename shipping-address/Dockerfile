# Use the official OpenJDK base image
 FROM openjdk:17-jdk-alpine



# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/shipping-docker.jar /app/

# Expose port 8080
EXPOSE 3322

# Run the application
ENTRYPOINT ["java", "-jar", "shipping-docker.jar"]

#expose DOCKER_BUILDKIT=0
#expose COMPOSE_DOCKER_CLI_BUILD=0
