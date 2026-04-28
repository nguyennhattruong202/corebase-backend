# Runtime stage
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app

ENV TZ="Asia/Ho_Chi_Minh"

# Copy JAR file từ build stage
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run application
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=8080"]