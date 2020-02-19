package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.model.Student;
import com.cts.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		return (List<Student>) studentRepository.findAll();
	}
	
	public Student addStudent(Student person) {
		return studentRepository.save(person);
	}
}