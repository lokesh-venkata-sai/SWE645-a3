FROM openjdk:17
COPY surveyJar.jar surveyJar.jar
ENTRYPOINT ["java", "-jar", "/surveyJar.jar"]
EXPOSE 8080