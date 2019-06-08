FROM openjdk:8-jre-alpine
ENV EXPOSED_PORT 8080
ADD target/KonkiServer.jar /usr/src/microservice/
WORKDIR /usr/src/microservice
EXPOSE $EXPOSED_PORT
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","KonkiServer.jar"]