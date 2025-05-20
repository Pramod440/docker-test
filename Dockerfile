FROM openjdk:17

COPY target/DockerDemo.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "DockerDemo.jar"]