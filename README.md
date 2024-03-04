# SWE645 Assignment 3: RESTful Web Services and JPA

## Project Overview
This project involves developing a Microservices-based application using Spring Boot, RESTful Web Services, and JPA/Hibernate. 
It interfaces with an Amazon Relational Database Service (Amazon RDS)/MySQL to implement CRUD operations managing student survey data. 
This application allows prospective students to provide feedback about their campus visit, including capabilities to create, retrieve, update, and delete surveys.

## Key Features
- **CRUD Operations**: Enables creating, viewing, updating, and deleting student survey feedback.
- **Microservices Architecture**: Built using Spring Boot for easy development and deployment.
- **Docker Containerization**: Ensures consistent environments through Docker containers.
- **Kubernetes Deployment**: Enhances scalability and manageability of the application on a Kubernetes cluster.
- **Amazon RDS Integration**: Utilizes Amazon RDS for reliable, scalable database services with MySQL.

## Technologies/Tools Used
- **Spring Boot**: Simplifies the development of new Spring applications through convention over configuration.
- **RESTful Web Services**: Allows the application to handle HTTP requests in a stateless, client-server architecture.
- **JPA/Hibernate**: Provides a layer of abstraction for database operations, simplifying CRUD operations with databases.
- **Docker**: Offers a platform for developers to develop, ship, and run applications inside containers.
- **Kubernetes**: An open-source system for automating deployment, scaling, and management of containerized applications.
- **Amazon RDS/MySQL**: Delivers a managed relational database service with MySQL for easily setting up, operating, and scaling a relational database in the cloud.
- **Jenkins for CI/CD**: An automation server used to automate the building, testing, and deployment phases of software development.
- **GitHub**: A platform for version control and collaboration, allowing multiple people to work together on projects.
- **Postman**: A collaboration platform for API development, Postman simplifies the process of developing APIs, making it easier to create, share, test, and document APIs.

## Setup and Deployment
The application was developed starting with a Maven project from [Spring Initializr](https://start.spring.io/), imported into Eclipse EE IDE for further development. It includes detailed steps for:
- Creating a MySQL database using Amazon RDS.
- Developing the application using Spring Boot.
- Containerizing the application with Docker.
- Deploying on Kubernetes using Rancher and managing deployments with Jenkins.

## Testing
The functionality was tested using Postman to ensure that the microservice responds correctly to CRUD operation requests.

## GitHub Repository
All code and deployment configurations are available at my [GitHub repository](https://github.com/lokesh-venkata-sai/SWE645-a3).

## Accessing the Application
The application can be accessed through specific endpoints provided by the Kubernetes deployment for creating and retrieving survey data.
