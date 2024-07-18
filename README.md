H2 Database with Spring Boot
H2 Database is a popular choice for embedded, in-memory databases in Spring Boot applications. Here's a guide on using it:

Dependency

Add the following dependency to your pom.xml file to use H2 Database:

XML
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>
Use code with caution.

Configuration

Properties for configuring H2 Database can be set in your application.properties file.

Data Persistence:
In-memory (data lost on application restart):
Properties
spring.datasource.url=jdbc:h2:mem:dblearning
Use code with caution.

File-based (persistent data):
Properties
spring.datasource.url=jdbc:h2:file:/data/testdb
Use code with caution.

Driver Class:
Properties
spring.datasource.driverClassName=org.h2.Driver
Use code with caution.

Username and Password:
Properties
spring.datasource.username=sa
spring.datasource.password=
Use code with caution.

JPA Dialect:
Properties
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
Use code with caution.

H2 Console

Enable the H2 console for managing the database through a web interface:

Properties
spring.h2.console.enabled=true
Use code with caution.

Additional Properties

Defer datasource initialization:
Properties
spring.jpa.defer-datasource-initialization=true
Use code with caution.

Update database schema on application start (optional):
Properties
spring.jpa.hibernate.ddl-auto=update
Use code with caution.

Accessing H2 Console

Once configured, you can access the H2 console at:

http://localhost:8080/h2-console
Login Credentials

Username: sa
Password: (blank)
Database File Location

The database file location depends on the datasource.url configuration:

File-based (jdbc:h2:file:/data/testdb):
The database file (testdb) is stored in the /data folder on your C drive.
User profile (jdbc:h2:file:~/testdb):
The database file (testdb) is stored in your current user profile directory.
H2 will create the directory if it doesn't exist.
You can further customize the subdirectory within the user profile using the ~ notation (e.g., jdbc:h2:file:~/subdirectory/demodb).