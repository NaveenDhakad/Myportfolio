# Build the project using Maven
FROM maven:3.9.5-openjdk-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline

COPY . .
RUN mvn clean package -DskipTests

# Second stage - Deploy to Tomcat
FROM tomcat:10.1.15-jdk21
# Copy the WAR file from the build stage to Tomcat's webapps directory
COPY --from=build /app/target/portfolio-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/portfolio.war

EXPOSE 8080

# Start the Tomcat server
CMD ["catalina.sh", "run"]
