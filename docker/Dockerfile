FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD *.jar app.jar
ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
