FROM openjdk:17-jdk-alpine
RUN apk --no-cache add curl
RUN curl -u admin:nexus -o jwt.jar "http://192.168.1.22:8081/:8081/repository/maven-releases/com/youtube/jwt/0.0.1/jwt-0.0.1.jar" -L
ENTRYPOINT ["java","-jar","/jwt.jar"]
EXPOSE 8087