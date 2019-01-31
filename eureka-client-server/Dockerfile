FROM openjdk:8
ADD target/eureka-client-server.jar eureka-client-server.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar","eureka-client-server.jar"]
