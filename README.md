# Birthday keeper app

This is a Spring Boot application that requires a PostgreSQL database with a "person" table. In order to start the application, please follow the steps below.

## Starting the Application

To start the application, open a terminal and navigate to the root directory of the project. Run the following command: mvn spring-boot:run


This command will start the Spring Boot application using the Maven build tool.

## Database Configuration

The application expects a PostgreSQL database with a "person" table running on port 55000. You can reconfigure the port and other database settings by editing the `application.properties` file located in the `src/main/resources` directory.

## Creating the Database

A `birthdaykeeper-db-dump.sql` file is included in the repository, which will create the required database with the desired structure. To restore the dump file and create the "person" table, follow these steps:

1. Make sure you have PostgreSQL installed on your system.
2. Create a new PostgreSQL database.
3. Restore the included `birthdaykeeper-db-dump.sql` file to the new database.

Given that you have a PostgreSQL database called "postgres" running on port 55000, the command to restore the structure will be:

```console
psql -U postgres -h localhost -p 55000 -d postgres -f /path/to/birthdaykeeper-db-dump.sql
```
