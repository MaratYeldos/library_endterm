# Library Management System
#### Library Management System is a software application implemented in Java platform using MS Access database design. It is useful for libraries in any university, college, or similar educational institution to manage and maintain data in database through computerized system. Using this system, users need not search the entire library to find a book; the list of books available is displayed by the application.

This is Library management system project that used following technologies

- Java 8
- Spring Boot
- JPA Hibernate
- Maven
- PostgreSQL
  **Functionality**

* All Controller have CRUD operators
* You can create, delete, update and get all tables
* You can search all these tables by id

### Directory Structure of Spring Boot Project
```bash
├── FinalJavaYeldosApplication.java
├── config
│   └── 
├── constant
│   └── ConstantStrings.java
├── controller
│   ├──
├── exception
│   └── ObjectNotFoundException.java
├── model
│   ├── Author.java
│   ├── Book.java
│   ├── Department.java
│   ├── Librarian.java
│   └── Student.java
│   └── Role.java
├── repository
│   ├── AuthorRepository.java
│   ├── BookRepository.java
│   ├── DepartmentRepository.java
│   ├── LibrarianRepository.java
│   └── StudentRepository.java
└── service
    ├── AuthorService.java
    ├── BookService.java
    ├── DepartmentService.java
    ├── Librarian.java
    ├── Student.java
```

## Diagram UML
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-21 в 10.20.34.png" width="334"/>


## Diagram
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-20 в 12.04.25.png" width="334"/>

## POSTMAN Example
### Get All Authors
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-20 в 13.07.02.png" width="650"/>

### Get by ID Author
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-20 в 13.07.58.png" width="650"/>

### Get save Author
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-20 в 13.09.00.png" width="650"/>

### Get update by ID Author
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-20 в 13.10.02.png" width="650"/>

### Get delete by ID Author
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-20 в 13.10.23.png" width="650"/>

### JMS Kafka
## Swagger Send Message
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 20s.05s.2022s в 14s-13s-55s.png" width="650"/>

<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-20 в 14.14.22.png" width="650"/>


## JWT
### Register User: we get Barreer Token
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-21 в 09.16.34.png" width="650"/>

### SignIn User here: we`re get sign in at the end we get Barreer Token 
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-21 в 09.20.33.png" width="650"/>

### Security work with next Controller Methods
## AuthorController.class: 
##### - getAllAuthor() where method hava Only ADMIN_ROLE methods return all Authors
##### -getAuthorById() where method hava Only CLIENT_ROLE methods return Author by ID


### ADMIN
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-21 в 09.25.18.png" width="650"/>

### CLIENT where we don`t have access because we are ADMIN
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-21 в 09.25.59.png" width="650"/>


## Tables
### Books
<img alt="Снимок экрана 2022-05-18 в 09 26 49" src="src/main/resources/img/Снимок экрана 2022-05-21 в 09.27.25.png" width="650"/>


## WOKR DONE
1. Create a database in postgres database. Create 5 entity tables, where is One-to-one, One-to-many, many-to-many relationships Create a DATABASE UML diagram.
2. Upload database backup file on project
3. Create Readme.MD file in project structure.
4. Use different type of beans annotations.
5. Use different type of Dependency Injections. (ONLY CONSTRUCTOR and
   Setter injection. NO FIELD injection)
6. Write service logic in service classes.
7. Use next annotations: @Configuration.
8. Use next annotations: @Bean with init and destroy methods.
9. Add AOP configuration. Use AspectJ annotation style.
   10.Use next annotations: @Before, @Pointcut, @After.
   11.Add real service/business logic in AOP code.
   12.Add Jpa repository support.
10. Add cache configuration.
11. Use different type of Query creation (https://docs.spring.io/spring-
    data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html - 2.3.2
    Query creation ).
12. Use Annotation based named query configuration 16.Declare query at the query method using @Query 17.Use SpEL expressions
    18.Use Transactionality/ Locking/Auditing
    19.Use JSR-349 Bean Validation
13. Use ALL next attributes:
14. Write scheduled method. Use @Scheduled annotations with attributes: • fixedDelay
    • fixedRate
    • initialDelay
15. Use CRUD methods
16. Use @GetMapping,@PostMapping,@PutMapping,@DeleteMapping on Controllers
17. Use RequestBody and ResponseBody Annotations. Read HTTP Headers in Spring REST Controllers.
18. Add JUnit test with at least 60% code coverage.
19. Use different type of Assertions.
20. Write JMS service. 1 method which send data to topic, second method
     which listen topic.
