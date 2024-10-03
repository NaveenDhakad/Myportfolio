FROM tomcat:10.1-jdk17
WORKDIR /portfolio/src/main/webapp/
RUN rm -rf ROOT
COPY target/portfolio-1.0-SNAPSHOT.war /portfolio/src/main/webapp/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]

