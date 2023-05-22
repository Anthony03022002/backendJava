FROM debia:11

RUN apt update & apt install -y openjdk-17-jre

COPY build/libs/integrador.core-0.0.1-SNAPSHOT-plain.jar /app.jar

CMD [ "java",".-jar", "app/jar"]