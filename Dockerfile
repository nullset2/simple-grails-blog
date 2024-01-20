FROM openjdk:8u151-jdk-alpine

EXPOSE 8080

WORKDIR /app
COPY ./build/libs/blog-0.1.war blog.jar

CMD ["java","-Dgrails.env=prod","-jar","/app/blog.jar"]
