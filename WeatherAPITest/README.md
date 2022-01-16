
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
![image](https://user-images.githubusercontent.com/18549389/149651976-0f63a2c8-cce3-4228-b49a-3fc7c5f24428.png)
## Setup of config.properties file
 1. Create a *Java package* file on `.\src\test\java` and name it as`config`
 2. Inside the package, create a file and name it as `config.properties` file
 3. Inside `config.properties` file, setup `baseURI` and `APIKey` key-value pairs with valid data.


![image](https://user-images.githubusercontent.com/18549389/149652024-731f36a6-9356-425c-8449-8a94435850f4.png)

## Run and usage 
**Suite Run** - User can use and run via TestNG using `testng.xml` file.

![image](https://user-images.githubusercontent.com/18549389/149652062-3d52f4b0-c4eb-4b50-af8c-6cf343970816.png)


**Per Test File** - Once TestNG plugin for eclipse is installed, user can run solo tests on  `src > test > AC#.java files`

![image](https://user-images.githubusercontent.com/18549389/149652048-5d823304-948c-480b-8a29-5fbe1c8c8187.png)
