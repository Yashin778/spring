package com.cts.bootJpa.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.bootJpa.model.Student;

public interface StudentRepository extends CrudRepository<Student,Long> {
	List<Student> findByFirstname(String name);
}