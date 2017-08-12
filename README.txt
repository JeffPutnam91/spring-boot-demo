This is a basic Spring Boot application that can retrieve a user by the given userName from a mySql database.

You will first need to install Gradle 3.5.1 as well as mySql. (I used WampServer which installed mySql at the same time)

Then you must either modify the application.properties file under src/main/resources to call your database 
using the correct credentials.

You can then use the included test.sql to create the test database.

In order to start the project just run the DemoApplication.java as a java application and then go to 
localhost:8080/getUser/{userName to retrieve}.