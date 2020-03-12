# GENESIS Microservice Template 0.1.0

## New dependencies
reactor-core
spring-webflux
springfox-spring-webflux
spring-boot-starter-actuator
jakarta.validation-api
validation-api
junit-jupiter-api

## Changes in dependency versions
Genesis Framework | 1.2.0

## Dependencies deleted
junit

## Other features
* cfg folder with DevOps configuration added.
Project name normalized with the format ${project.groupId}:${project.artifactId}
* Swagger annotations updated.
* Adding files: .gitattributes, RELEASE.md and lombok.config
* Lombok library was included in sonar configuration.
* Resolved some Smell Codes (Critics and majors).
* It was increased coverage for unit tests.
* Deprecated method from libraries were replaced.
* Scan stage was added.
* Classes without use were removed.
* Fixed potential bugs detected with new version of spotbugs.
* Test units were updated to JUnit 5.
* Deleting gradle configuration.
