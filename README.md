# GiantMachineCodingExercise_TimeSheetEntry

[![Build Status](https://app.travis-ci.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry.svg?branch=master)](https://app.travis-ci.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry)

Minimal SpringBoot application supplying endpoints to retrieve all Time Sheets and create a new Time Sheet.

## Requirements

For building and running the application you need:

- [Java 17](https://openjdk.org/projects/jdk/17/#:~:text=JDK%2017%20is%20the%20open-source%20reference%20implementation%20of,Oracle%3B%20binaries%20from%20other%20vendors%20will%20follow%20shortly.)
- [Maven 4 Download](https://maven.apache.org/download.cgi)
- [Maven 4 Installation Guide](https://maven.apache.org/install.html)

## Tools

- IntelliJ Idea 2022.2
- PostMan

## Dependencies used in this project

- com.h2database
- spring-boot-starter-jdbc
- spring-boot-starter-data-jpa
- spring-boot-starter-test
- spring-boot-maven-plugin

## Getting Started

Clone repo using your prefered IDE.

There are many ways you can run this program.

### 1. Running the application locally using IDE

- To execute locally after importing into your IDE is by using the main method in the `com.example.giantmachinecodingexercise_timesheetentry` class from your IDE.

### 2. Running the application locally using terminal

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```
mvn spring-boot:run
```

Clone Repo using your Terminal. (Quickest granted you have installed the prerequistes)

```
git clone https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry.git
cd GiantMachineCodingExercise_TimeSheetEntry
```

This goal runs the application in place. Further doucmentation can be sourced [on the Spring Documentation Website](https://docs.spring.io/spring-boot/docs/3.1.x-SNAPSHOT/maven-plugin/reference/pdf/spring-boot-maven-plugin-reference.pdf)

## After you've launched the project

Try visiting these endpoints:

`http://localhost:8080/api/newEntry` - Adds new entry using the HTTP GET method.

`http://localhost:8080/api/timeSheetEntry` - Displays all entries in [Data.csv](https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry/blob/master/src/main/resources/file.csv)

Notice the aformentioned endpoint fails. **Use Postman to submit test data**

## Data Used

Data used in this project can be found [Data.csv](https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry/blob/master/src/main/resources/file.csv)
