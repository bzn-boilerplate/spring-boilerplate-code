## Boiler Plate
--------------------------------------------------------------------

Spring Starter poject 

- Dependencies

	[Rest Repositories], [JPA], [MySQL]
	
	
```
#JPA Configurations
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect #Dialect For JPA - MYSQL

#DataSource(Database Configuration)
spring.datasource.url=jdbc:mysql://localhost:3306/mydb?useSSL=false&createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=

#HATEOAS
spring.data.rest.defaultMediaType=application/json
```

### Entity -> Student
### Repository -> RepositoryRestResource 

> (bind with Model **student** linked on path => 'students')

```
@RepositoryRestResource(collectionResourceRel = "student", path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
	
	List<Student> findByLastName(@Param("lastname") String name);
	
}
```

> http://localhost:8080/students

**searchQuery**

> http://localhost:8080/students/search/findByLastName?lastname=Kumar