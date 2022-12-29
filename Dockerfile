FROM openjdk:8
ADD target/*.jar applicationjar.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "applicationjar.jar"]
