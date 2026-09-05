FROM eclipse-temurin:25-jdk AS build

WORKDIR /build

COPY . .

RUN ./mvnw clean package -DskipTests=true


FROM eclipse-temurin:25-jre

WORKDIR /app

COPY --from=build /build/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]