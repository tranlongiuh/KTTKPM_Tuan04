FROM openjdk:11.0.12
ARG JAR_FILE=*.jar
COPY  ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080