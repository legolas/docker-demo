FROM java:openjdk-8u111-jdk-alpine
MAINTAINER Marcel Dullaart

VOLUME /tmp

ADD docker-demo.jar /docker-demo.jar

RUN sh -c 'touch /docker-demo.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-demo.jar"]
