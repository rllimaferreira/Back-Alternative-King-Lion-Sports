# Somente para buildar
FROM maven:3.8.5-openjdk-17-slim AS MAVEN_BUILD
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean install "-Dmaven.test.skip=true" && mvn package

# Somente para rodar
FROM openjdk:17-slim
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/ecommerce-*.jar /app/ecommerce.jar
ENTRYPOINT ["java","-Dspring.profiles.active=docker", "-jar", "ecommerce.jar"]
