
# H2 Database Configuration

## Dependency
To use the H2 Database, add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

Ensure that you use the latest version of the dependency.

## Property File Configuration

You can configure your H2 database in the `application.properties` file.

### In-Memory Database (Temporary Data)
If you don't want to persist the data in the database, use the following configuration:

```properties
spring.datasource.url=jdbc:h2:mem:dblearning
```

### File-Based Database (Persistent Data)
If you want to persist the data in the database, use the following configuration:

```properties
spring.datasource.url=jdbc:h2:file:/data/testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.defer-datasource-initialization=true
spring.jpa.hibernate.ddl-auto=update
```

You can either persist the data permanently or temporarily by choosing the proper `datasource.url` in `application.properties`.

## H2 Console
To check the database in a console, use the following URL:

[http://localhost:8080/h2-console](http://localhost:8080/h2-console)

### Console Credentials
- **User Name**: sa
- **Password**: (leave blank)
- **JDBC URL**: Copy from `application.properties`

## Where to Find the Database File?
For example, the following database (`/testdb`) can be found inside the `/data` folder on the C: drive, with the same name as the database name.

```properties
spring.datasource.url=jdbc:h2:file:/data/testdb
```

You can change the subdirectory as well. The following configuration creates a new database inside the current user's profile. The `~` symbol allows us to create a new database inside the current user profile. Even if the `/subdirectory` folder is not present, H2 will create it inside our user profile and store the database file.

```properties
spring.datasource.url=jdbc:h2:file:~/testdb
spring.datasource.url=jdbc:h2:file:~/subdirectory/demodb
```

By using these configurations, you can control whether the data is persisted permanently or temporarily in your H2 database.
