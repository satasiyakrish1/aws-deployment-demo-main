# Use Java 21 runtime image
FROM public.ecr.aws/amazoncorretto/amazoncorretto:21

# Set working directory inside the container
WORKDIR /app

# Copy WAR file to the image
COPY target/backend.jar backend.jar

# Run the application
ENTRYPOINT ["java", "-jar", "backend.jar"]