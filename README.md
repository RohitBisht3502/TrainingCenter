# <h1 align = "center">  Training Center API </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
</a>
    <img alt = "License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
    </a>
</p>


---

<p align="left">

## Overview

The Training Center Management Application is a Spring Boot-based web application designed to facilitate the management of training centers. It enables users to perform various operations related to training center management, including creating new centers and retrieving details about existing centers. 

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven
- **Database:** MySql
## Data Flow

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

1. **Post Centers:** `POST /centers`
   
   This endpoint creates a Training centers..

   ```java
   @PostMapping("centers")
   public String creatingCenters(@RequestBody Center newUser) {
       
   }
   ```

2. **GET Centers:** `GET /centers`
   
   Tis endpoint get all the training centers.

   ```java
     @GetMapping("centers")
   public List<Center> getAllCenters(){
       
    }
   ``````
### Services

The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

- Validating input data.
- Performing CRUD operations on restaurant data.
- Handling data transformations and interactions with external systems (if applicable).

### Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for restaurant data. Additionally, it may include data mapping and conversion between Java objects and database entities.

The project utilizes the following data structures:

### Center Class

The `Center` class defines the structure data the following fields:

- centerId (Type: Long): An identifier for the training center.
- centerName (Type: String): The name of the training center.
- centerCode (Type: String): A unique code assigned to the training center, typically alphanumeric and exactly 12 characters long.
- address (Type: Address): An object representing the address of the training center, including detailed address, city, state, and pincode.
- studentCapacity (Type: Integer): The maximum capacity of students the training center can accommodate.
- coursesOffered (Type: List<String>): A list of courses offered by the training center.
- createdOn (Type: LocalDateTime): A timestamp indicating when the training center was created.
- contactEmail (Type: String): The email address associated with the training center for contact purposes.
- contactPhone (Type: String): The phone number associated with the training center for contact purposes.
### Address Class

The `Address` class defines the structure for address data and includes the following fields:

- detailedAddress (Type: String): The detailed address, including street name, building number, etc.
- city (Type: String): The city where the training center is located.
- state (Type: String): The state where the training center is located.
- pincode (Type: String): The postal code or ZIP code of the training center's location.

### MySql

The project utilizes the `MYSql` database to store and manage lists of `users` ,`post`,`comment` objects in various parts of the application. `MySql` provides permanent storage and efficient element retrieval, making it suitable for storing blog records and performing operations on them.

These database enable the application to organize and manipulate blog data efficiently while maintaining data integrity.

## Project Summary

The Training Center Management Application is a Spring Boot-based web application designed to streamline the management of training centers. It provides users with a platform to perform various operations related to training center management, such as creating, updating, and deleting centers, as well as retrieving details about existing centers.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

## Contact
For questions or feedback, please contact [Rohit singh bisht](mailto:business.rohitbisht3502@gmail.com)
