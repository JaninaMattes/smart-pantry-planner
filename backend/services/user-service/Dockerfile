FROM eclipse-temurin:21-jre 
WORKDIR /app
COPY build/libs/user-service-*.jar app.jar
EXPOSE 8080

RUN adduser --system springuser
USER springuser
ENTRYPOINT ["java", "-jar", "app.jar"]
