FROM openjdk:17

ARG JAR_FILE=target/*jar

COPY ${JAR_FILE} SpringProjForDocker.jar

ENTRYPOINT [ "java","-jar","/SpringProjForDocker.jar" ]

EXPOSE 8761