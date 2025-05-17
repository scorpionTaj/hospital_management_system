# Hospital Management Project

A project to demonstrate and test Object-Relational Mapping (ORM) concepts and CRUD operations in a hospital context using Spring Boot.

---

## Author
- **Name:** Tajeddine Bouhrim
- **Filière:** Master SDIA

---

## Table of Contents
1. [Introduction](#introduction)
2. [Features](#features)
3. [Installation](#installation)
4. [Usage](#usage)
5. [Technologies Used](#technologies-used)
6. [Project Structure](#project-structure)
7. [Setup Instructions](#setup-instructions)
8. [Testing](#testing)
9. [Screenshots](#screenshots)
10. [License](#license)

---

## Introduction

This project is part of the **Master SDIA** program, for the course **Distributed Systems and Middleware**. It implements a simple hospital management system to explore ORM, CRUD, and web application concepts with Spring Boot.

---
## Features
- Add, update, delete, and retrieve patient records via a web interface.
- Search patients by name.
- Pagination of patient list.
- View patient details.
- Switch between H2 Database and MySQL (MariaDB) by configuration.

## Authentication & Authorization
- Custom login page with Spring Security (username/password).
- Role-based access control: `USER` and `ADMIN` roles.
- In-memory users by default (e.g., user1/user2/admin with password `SDIA`).
- Secure endpoints (`/deletePatient/**`, `/admin/**`, `/user/**`).

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/scorpionTaj/hospital_management_system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd hospital_management_system
   ```
3. Install dependencies:
   ```bash
    ./mvnw clean install
   ```

---

## Usage

1. Start the application:
   ```bash
   ./mvnw spring-boot:run
   ```
2. Access the application at `http://localhost:8084/index`.

---
## Technologies Used
- **Java 17+**: Programming language.
- **Spring Boot**: Application framework.
- **Spring Data JPA**: ORM and database access.
- **H2 Database**: In-memory database for development/testing.
- **MySQL (MariaDB)**: Relational database for production.
- **Lombok**: Reduces boilerplate code.
- **Maven**: Build tool.
- **Thymeleaf**: Templating engine for web UI.
- **Bootstrap**: For responsive UI design.

---
## Project Structure
- `entities/Patient.java`: Defines the `Patient` entity.
- `repository/PatientRepository.java`: JPA repository for database operations.
- `web/PatientController.java`: Web controller for handling UI requests.
- `HospitalApplication.java`: Main application class with a `CommandLineRunner` for testing and seeding data.
- `templates/`: Contains Thymeleaf HTML templates for the web UI.

---
## Setup Instructions

### Prerequisites
- Java 17 or higher
- Maven
- Any IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)
- MySQL (if using MariaDB)

### Steps to Run
1. Clone the repository.
2. Open the project in your IDE.
3. Configure the database in `application.properties`:
    - For H2:
    ```ini
    spring.datasource.url=jdbc:h2:mem:patients-db 
    spring.h2.console.enabled=true
   ```
         
   - For MySQL (MariaDB):
   ```ini
    spring.datasource.url=jdbc:mysql://localhost:3306/hospital-db?createDatabaseIfNotExist=true
    spring.datasource.username=root
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
    spring.jpa.show-sql=true
   ```
4. Run the application using the `HospitalApplication` class or with `./mvnw spring-boot:run`.
5. Access the H2 console at `http://localhost:8080/h2-console` (if using H2).
6. Use the web interface to manage patients.

---
## Screenshots

Below are some screenshots demonstrating the main features and database views of the application:

### 1. Web Interface

- **Login Page:**
  - ![Login Page](Screenshots/Login%20Page.png)
  - ![User Login Page](Screenshots/User%20Login.png)

- **Access Denied Page:**
  - ![Access Denied Page](Screenshots/Access%20Denied.png)

- **Logout Button:**
  - ![Logout Button](Screenshots/Logout%20Success.png)

- **Patient List with Pagination:**
  - ![Website Pagination](Screenshots/Website%20Pagination.png)
  - ![Pagination Improvement](Screenshots/Website%20Pagination%20and%20improvement.png)

- **Add Patient Form:**
  - ![Add Patient Form](Screenshots/Add%20Patient.png)

- **Patient Details:**
  - ![Patient Details](Screenshots/Patient%20Details.png)

- **Edit Patient:**
  - ![Edit Patient](Screenshots/Patient%20Edit.png)

- **Patient Added Successfully:**
  - ![Added Successfully](Screenshots/Patient%20Added%20With%20Success%20from%20Website.png)

- **Patient Removed Successfully:**
  - ![Removed Successfully](Screenshots/Patient%20Remove%20With%20Success.png)

### 2. H2 Database Console
- **H2 Console Connection Test:**
  ![H2 Connection Test](Screenshots/H2%20Connection%20test.png)
- **H2 Console Connection Success:**
  ![H2 Connection Reussite](Screenshots/H2%20Connection%20Reussite.png)

### 3. MariaDB / PHPMyAdmin
- **MariaDB Database View:**
  ![MariaDB Database](Screenshots/MariaDB%20Database.png)
- **Patient Added via PHPMyAdmin:**
  ![Patient Added With Success from PHPMyAdmin](Screenshots/Patient%20Added%20With%20Success%20from%20PHPMyAdmin.png)

---
## Testing
The application includes a `CommandLineRunner` in the `HospitalApplication` class to test the following operations:
- Adding patients.
- Retrieving all patients.
- Retrieving a patient by ID.
- Searching patients by name.
- Updating a patient's score.
- Deleting a patient.

---
## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

