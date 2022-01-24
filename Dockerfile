FROM adoptopenjdk/openjdk11:jre-11.0.10_9-alpine

LABEL vendor="Intershop Communications AG"

COPY ./build/libs/*.jar /usr/local/java-app/app.jar
COPY ./docker-scripts/java-entrypoint.sh /usr/local/java-app/java-entrypoint.sh

RUN chmod +x /usr/local/java-app/java-entrypoint.sh
ENTRYPOINT /usr/local/java-app/java-entrypoint.sh
