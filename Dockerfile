FROM openjdk:17-jre-slim
LABEL authors="daint"
WORKDIR /app
COPY target/demo-docker-0.0.1-SNAPSHOT.jar ./app/demo-docker-0.0.1-SNAPSHOT.jar
EXPOSE 9000
CMD ["java", "-jar", "demo-docker.jar"]