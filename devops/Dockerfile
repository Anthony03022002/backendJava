FROM debian:11

RUN apt update && apt install -y openjdk-17-jre

COPY integrador.core-0.0.1-SNAPSHOT-plain /app.jar

CMD ["java","-jar", "/app.jar"]