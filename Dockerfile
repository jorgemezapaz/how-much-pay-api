FROM openjdk:22-ea-21-slim-bullseye
COPY build/libs/how-much-pay-api-0.0.1.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]