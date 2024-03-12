# Start with base image contaning Java runtime
FROM openjdk:17

# Information around who maintains the image
MAINTAINER tuneprotect.com

# Add the application's jar to the container
COPY target/rs_policy_service_actions-0.0.1-SNAPSHOT.jar rs_policy_service_actions-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java","-jar","rs_policy_service_actions-0.0.1-SNAPSHOT.jar"] 