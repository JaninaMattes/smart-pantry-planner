FROM eclipse-temurin:21-jre 
WORKDIR /app
ARG JAR_FILE=build/libs/user-service-*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080

RUN adduser --system springuser
USER springuser
ENTRYPOINT ["java", "-jar", "app.jar"]
