# Getting Started
# Todo List Application

This is a simple Todo List application implemented using Spring Boot, Hibernate, Gradle, and MySQL.

# Application Features
    Create a new todo item.
    Retrieve all todo items.
    Retrieve a specific todo item by ID.
    Update an existing todo item.
    Delete a todo item.

# Prerequisites
    Java Development Kit (JDK): For running the Java code. Any version from 8 onwards is good.
    MySQL: The database for storing data.
    Gradle: A build tool to manage dependencies and the build process.

# How To Setup And Run The Application

Clone this repository to your local system.

    git clone https://github.com/YuriySolomin/task_todolist.git

Navigate to your MySQL console and create a new database named todoDb.

In the src/main/resources/application.yml file replace your_db_username and your_db_password with your MySQL username and password.

In your terminal, navigate to the root directory of the project.

Run the following command to start the application:

    ./gradlew bootRun

The application will start on

    http://localhost:8087.

API Endpoints 

* GET /todos - Retrieves all todo items 
* GET /todos/{id} - Retrieves a specific todo item by ID 
* POST /todos - Creates a new todo item 
* PUT /todos - Updates a specific todo item 
* DELETE /todos/{id} - Deletes a specific todo item

Here's the JSON body format for creating or updating a todo item:
json

    {
        "title": "Item title",
        "description": "Item description"
    }

Use a REST client like Postman to send HTTP requests to those endpoints.

How To Build The Application
To build a standalone JAR file, navigate to the root directory of your project in the terminal and run the following command:

    ./gradlew clean build

Navigate to build/libs in your project directory, you will find a .jar file that you can run with:

    java -jar build/libs/todo-list-0.0.1-SNAPSHOT.jar

Don't forget to replace 

    todo-list-0.0.1-SNAPSHOT.jar

with the actual .jar file name.

License

    MIT

Please replace all placeholders such as username/repository.git and your_db_username and your_db_password 
with the actual values. Adjust content according to your application requirement.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.sql.jdbc)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

