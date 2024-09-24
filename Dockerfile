FROM ubuntu:latest AS build
RUN apt-get update && apt-get install -y openjdk-21-jdk maven
WORKDIR /app/demo-spring-data-Gabriel-Lopes
COPY . .
RUN mvn clean install

FROM openjdk:21-jdk-slim
EXPOSE 8080
COPY --from=build /app/demo-spring-data-Gabriel-Lopes/target/demo-spring-data-Gabriel-Lopes-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]


