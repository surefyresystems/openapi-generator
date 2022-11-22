FROM maven:3.6.3-jdk-11-openj9

ADD . /generator/

WORKDIR /generator/

RUN mvn clean package -DskipTests

# GENERATOR_HOST can be used to determine the target location of a download link.
# The default value assumes binding to host via: docker -p 8080:8080 image_name
# Generally, this "just works" without GENERATOR_HOST, and this is provided only as
# a workaround if all else fails.
ENV GENERATOR_HOST=""

EXPOSE 8080

CMD ["java", "-jar", "/generator/modules/openapi-generator-online/target/openapi-generator-online.jar"]