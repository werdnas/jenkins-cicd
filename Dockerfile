FROM openjdk:17
ADD ./target/student-kubernetes-demo-0.0.1-SNAPSHOT.jar student-kubernetes-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/student-kubernetes-demo-0.0.1-SNAPSHOT.jar"]
