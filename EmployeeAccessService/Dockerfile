FROM java:8
VOLUME /tmp
ADD target/EmployeeAccessService-0.0.1-SNAPSHOT.jar EmployeeAccessService.jar
RUN bash -c 'touch /EmployeeAccessService.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /EmployeeAccessService.jar"]