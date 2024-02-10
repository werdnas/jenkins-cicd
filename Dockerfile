FROM openjdk:17
ADD ./target/jenkins-cicd-0.0.1-SNAPSHOT.jar jenkins-cicd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/jenkins-cicd-0.0.1-SNAPSHOT.jar"]
