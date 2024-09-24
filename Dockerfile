FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y

WORKDIR /app/demo-spring-data-Gabriel-Lopes

COPY demo-spring-data-Gabriel-Lopes/pom.xml .

RUN apt-get install maven -y

COPY demo-spring-data-Gabriel-Lopes/. .

RUN mvn clean install

FROM openjdk:21-jdk-slim

EXPOSE 8080

COPY --from=build /app/demo-spring-data-Gabriel-Lopes/target/demo-spring-data-Gabriel-Lopes-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]


