# Employee REST Service

A Spring Boot REST API that manages employee data with support for:
- Retrieving employee records via HTTP GET
- Adding new employees via HTTP POST
- Unit testing using JUnit and Spring Boot Test framework

## Features

- 📋 Add and retrieve employee details  
- ✅ Unit tests using `@SpringBootTest` and `TestRestTemplate`  
- 🧪 Tests validate API endpoints and ensure application reliability

## Tech Stack

- Java 17+  
- Spring Boot  
- Maven  
- JUnit 5  
- Spring Boot Test  
- VS Code / IntelliJ  

## Project Structure

src/
├── main/
│ └── java/
│ └── com/example/demo/
│ ├── Employee.java
│ ├── EmployeeController.java
│ ├── EmployeeManager.java
│ ├── Employees.java
│ └── RestServiceApplication.java
├── test/
│ └── java/
│ └── com/example/demo/
│ └── EmployeeControllerTest.java

## How to Run

1. **Clone the repository**  
   
   git clone https://github.com/Vindhya733/employee-rest-service.git
   cd employee-rest-service

2. **Build the project**
    mvn clean install
   
4. **Run the application**
   mvn spring-boot:run
   
6. **Access endpoints**
   POST /employees — Add a new employee

## Run Tests
To run all unit tests:
mvn test

## License
This project is for educational/demo purposes only.













