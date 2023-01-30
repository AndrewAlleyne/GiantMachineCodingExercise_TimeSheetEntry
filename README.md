# GiantMachineCodingExercise_TimeSheetEntry

[![Build Status](https://app.travis-ci.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry.svg?branch=master)](https://app.travis-ci.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry)

Minimal SpringBoot application supplying endpoints to retrieve all Time Sheets and create a new Time Sheet. 


## Requirements

For building and running the application you need:
- [Java 17](https://openjdk.org/projects/jdk/17/#:~:text=JDK%2017%20is%20the%20open-source%20reference%20implementation%20of,Oracle%3B%20binaries%20from%20other%20vendors%20will%20follow%20shortly.)
- [Maven 4 Download](https://maven.apache.org/download.cgi)
- [Maven 4 Installation Guide](https://maven.apache.org/install.html)

### Tools
IntelliJ Idea 2022.2

## Getting Started
There are many ways you can run this program. 
1. Clone repo using your prefered IDE.
2. Clone Repo using your Terminal. (Quickest granted you have installed the prerequistes) 
  `git clone https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry.git
   cd GiantMachineCodingExercise_TimeSheetEntry
   `
   In your terminal run the maven build command
   `mvn spring-boot:run` - This goal runs the application in place. Further doucmentation can be sourced here [Spring Boot Maven Plugin] (https://docs.spring.io/spring-boot/docs/3.1.x-SNAPSHOT/maven-plugin/reference/pdf/spring-boot-maven-plugin-reference.pdf)



`https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry.git
## Running thea application locally
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the  `com.example.giantmachinecodingexercise_timesheetentry`  class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
## Sample Data
Data used in this project can be found [Data.csv](https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry/blob/master/src/main/resources/file.csv)

#Endpoints
`newEntry` - Adds new entry using the HTTP GET method. 
`timeSheetEntry` - Displays all entries in  [Data.csv](https://github.com/AndrewAlleyne/GiantMachineCodingExercise_TimeSheetEntry/blob/master/src/main/resources/file.csv)
