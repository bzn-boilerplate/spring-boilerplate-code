/**
 * 
 */
package com.biznomy.boilerplate.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.biznomy.boilerplate.model.Student;

/**
 * @author technolabs
 *
 */
@RepositoryRestResource(collectionResourceRel = "student", path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
	
	List<Student> findByLastName(@Param("lastname") String name);
	
}
