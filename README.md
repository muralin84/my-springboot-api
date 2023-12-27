# my-springboot-api

This is a Java Spring Boot REST API project that provides a multiplication service.

## Project Structure

The project has the following structure:

```
my-springboot-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── myapi
│   │   │               ├── controller
│   │   │               │   └── MultiplicationController.java
│   │   │               ├── model
│   │   │               │   └── Multiplication.java
│   │   │               ├── service
│   │   │               │   └── MultiplicationService.java
│   │   │               └── MyApiApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── myapi
│                       └── service
│                           └── MultiplicationServiceTest.java
├── pom.xml
├── README.md
└── .vscode
    ├── settings.json
    └── launch.json
```

## API Endpoints

The API provides the following endpoint:

- `GET /multiply/{num1}/{num2}`: Returns the multiplication of `num1` and `num2`.

## Usage

To use this API, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/my-springboot-api.git
   ```

2. Build the project using Maven:

   ```bash
   cd my-springboot-api
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Access the API at `http://localhost:8080`.

## Testing

The project includes unit tests for the `MultiplicationService` class. To run the tests, use the following command:

```bash
mvn test
```

## Configuration

The application can be configured using the `application.properties` file located in the `src/main/resources` directory.

## Development Environment

The project includes configuration files for Visual Studio Code located in the `.vscode` directory. These files provide settings for the IDE.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.