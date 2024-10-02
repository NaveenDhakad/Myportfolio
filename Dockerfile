FROM jelastic/maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:21-jdk-slim
COPY --from=build /target/portfolio-1.0-SNAPSHOT.jar portfolio.jar
EXPOSE 8080
ENTRYPOINT ["portfolio.html","-jar" ,"portfolio.jar"]


