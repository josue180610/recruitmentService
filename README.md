# Project Title

TODO: One Paragraph of project description goes here

## Getting Started

TODO: These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads) - Programming Language.
* [Maven](https://maven.apache.org/) - Dependency Management.
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to microservices.

### Installing

Para la compilación, empaquetamiento e instalación del artefacto se ejecutan los siguientes comandos.

```
mvn clean
mvn install
```
## Running

Para la ejecución del microservicio ejecutamos el siguiente comando.

```
mvn spring-boot:run
```

Para invocar el endpoint de pruebas se puede utilizar el comando curl.

```
curl -H "request-id: 550e8400-e29b-41d4-a716-446655440000" -H "request-date:2019-08-01T17:15:20.509-0400" http://localhost:8080/recruitmentservice/v1/greeting
```

En el caso que se quiera acceder al Swagger se requiere correr el microservicio con el profile dev o swagger. Por ejemplo:

```
mvn spring-boot:run -Dspring.profiles.active=swagger 
```
o
```
mvn spring-boot:run -Dspring.profiles.active=dev 
```

Y para consultar el Swagger se puede utilizar el comando curl.

```
curl  http://localhost:8080/v2/api-docs
```

## Running the tests

Para la ejecución de los test ejecutamos el siguiente comando.

```
mvn test
```

### Break down into end to end tests

TODO: Listar los test.

### And coding style tests

Para el evaluar el código se utilizan las siguiente herramientas.

* [CheckStyle](https://checkstyle.sourceforge.io/) - Para los estilos de código.
* [Spotbugs](https://spotbugs.github.io/) - Para el análisis estático de código.

## Deployment

TODO: Add additional notes about how to deploy this on a live system

## Built With

* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads) - Programming Language.
* [Maven](https://maven.apache.org/) - Dependency Management.
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to microservices.
* [Genesis] - Framework para la implementación de Arquitectura Digital en Telefónica del Perú.

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **everis SAC** - *Initial work* - [everis](https://www.everis.com/peru)