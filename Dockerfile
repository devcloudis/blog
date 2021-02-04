FROM openjdk:15-alpine

EXPOSE 8080

COPY ./target/blog*.jar app.jar

ARG jvm_opts=""
ENV JDK_JAVA_OPTIONS="${jvm_opts}"

ENTRYPOINT ["java", "-jar", "/app.jar"]