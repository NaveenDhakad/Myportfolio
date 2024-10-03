FROM jelastic/maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:21-jdk-slim
COPY --from=build /target/original-portfolio-1.0-SNAPSHOT.war portfolio.war
EXPOSE 8080
ENTRYPOINT ["java","-jar" ,"portfolio.war"]


