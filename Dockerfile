FROM amazoncorretto:11-alpine-jdk
MAINTAINER FB
COPY target/fb-0.0.1-SNAPSHOT.jar fb-app.jar
ENTRYPOINT  ["java","-jar","/fb-app.jar"]

