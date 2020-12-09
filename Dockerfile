FROM maven:3.5.3-jdk-8-alpine
COPY ./. /src

WORKDIR /src

ENTRYPOINT ["mvn", "clean", "verify"]
