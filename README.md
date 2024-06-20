# Selenide Cucumber TestNG Maven Allure Framework

This is a sample test automation framework using Selenide, Cucumber, TestNG, Maven, and Allure. The framework automates the login functionality of the [Sauce Demo](https://www.saucedemo.com/) website.

## Project Structure

- `common`: Contains utility classes for browser and test data management.
- `pages`: Contains the Page Object Model classes for different web pages.
- `runner`: Contains the TestNG Cucumber test runner.
- `stepdefinitions`: Contains the step definition classes for Cucumber.
- `resources/features`: Contains the Cucumber feature files.
- `pom.xml`: Maven configuration file.
- `README.md`: Instructions to set up and run the project.

## Prerequisites

- JDK 11 or higher
- Maven
- Chrome Browser

## Setup and Execution

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn clean install` to install the required dependencies.
4. To execute the tests, run `mvn test`.

## Running in Headless Mode

The framework is configured to run in headless mode by default. This means that the browser will not open a graphical user interface (GUI) and will run tests in the background.

## Handling Exceptions

Exceptions during test execution are caught and printed to the console. If an exception occurs, the test will fail and the stack trace will be displayed in the console output.

## Allure Reports

To generate Allure reports, run the following command after executing the tests:

```bash
mvn allure:serve
