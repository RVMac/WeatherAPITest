
# Automated API Testing for https://www.weatherbit.io/

**Version 1.0.0**

> Automated API testing for weatherbit.io

This is a sample automated API testing for weatherbit.io using Java, REST Assured and TestNG framework.

## Pre-requisites
- Java (version 8 or above)
- Java IDE (Eclipse, IntelliJ, etc.)

## Installation / Setup

 1. Clone the repository
 2. Wait for maven dependencies to be installed.
> Optional: for convenience, user can install TestNG plugin for eclipse on Help > Install New Software

## Setup of config.properties file
 1. Create a *Java package* file on `.\src\test\java` and name it as`config`
 2. Inside the package, create a file and name it as `config.properties` file
 3. Inside `config.properties` file, setup `baseURI` and `APIKey` key-value pairs with valid data.


## Run and usage 
**Suite Run** - User can use and run via TestNG using `testng.xml` file.

**Per Test File** - Once TestNG plugin for eclipse is installed, user can run solo tests on  `src > test > AC#.java files`