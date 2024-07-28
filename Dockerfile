FROM openjdk:21-jdk-slim
VOLUME /tmp
EXPOSE 8080
ADD build/libs/contacts-app-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]