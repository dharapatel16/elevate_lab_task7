# Java MySQL JDBC CRUD Application

This is a simple command-line Java application that performs CRUD (Create, Read, Update, Delete) operations on a MySQL database using JDBC.

---

## Features

- Connects to MySQL using JDBC
- Adds, views, updates, and deletes users from a `users` table
- Uses `PreparedStatement` to prevent SQL injection
- Clean separation of logic (DB, DAO, Main)

---

## Compile and Run (Windows)

Use the following commands to compile and run the application:

```bash
javac -cp ".;mysql-connector-j-9.3.0.jar" *.java
java -cp ".;mysql-connector-j-9.3.0.jar" MainApp

