# Employee-Department Microservices

Employee-Department Microservices is a sample microservices architecture designed to manage information about employees and departments. This project demonstrates how to build a scalable and modular system using microservices.

## Architecture Overview

The project consists of the following microservices:

- **Employee Service:** Manages employee information.
- **Department Service:** Handles department-related operations.
- **API Gateway:** Serves as a single entry point for external clients, routing requests to the appropriate microservices.
- **Service Discovery (Eureka):** Manages the registration and discovery of microservices.
- **Config Server:** Centralized configuration management for microservices.

## Features

- **Employee Management:**
  - Add, update, and delete employee details.
  - Retrieve employee information by ID.
- **Department Management:**
  - Add, update, and delete department details.
  - Retrieve department information by ID.
- **Microservices Communication:**
  - Demonstrates communication between microservices.
- **Centralized Configuration:**
  - Utilizes a centralized configuration server for microservices.

## Getting Started

Follow these steps to get the Employee-Department Microservices up and running on your local machine.

### Prerequisites

- [Java](https://www.oracle.com/java/) installed.
- [Spring Boot](https://spring.io/projects/spring-boot) installed.
- [Docker](https://www.docker.com/) installed (optional).

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/employee-department-microservices.git
    ```

2. Navigate to the project directory:

    ```bash
    cd employee-department-microservices
    ```

3. Start the microservices:

    - For each microservice (Employee Service, Department Service, API Gateway, Eureka, Config Server), navigate to its directory and run:

        ```bash
        ./mvnw spring-boot:run
        ```

    - Alternatively, use Docker to build and run the microservices:

        ```bash
        docker-compose up
        ```

4. Access the services:

    - Employee Service: [http://localhost:8081](http://localhost:8081)
    - Department Service: [http://localhost:8082](http://localhost:8082)
    - API Gateway: [http://localhost:8080](http://localhost:8080)
    - Eureka Dashboard: [http://localhost:8761](http://localhost:8761)
    - Config Server: [http://localhost:8888](http://localhost:8888)

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [Docker](https://www.docker.com/)

## Contributing

Feel free to contribute to the development of Employee-Department Microservices. Please follow the [contribution guidelines](CONTRIBUTING.md) for submitting pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Acknowledgments

- Hat tip to anyone whose code was used.
- Inspiration.
- etc.

Happy microservices development!
