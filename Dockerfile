FROM adoptopenjdk/openjdk13:latest
WORKDIR /usr/app
COPY ./target/spring-travis-heroku-0.0.1.jar /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-travis-heroku-0.0.1.jar"]