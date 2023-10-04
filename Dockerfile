FROM amazoncorretto:21
WORKDIR /
ARG JAR=target/*.jar
COPY ${JAR} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]