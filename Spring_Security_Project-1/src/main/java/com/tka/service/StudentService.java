package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Student;
import com.tka.repository.StudentRepository;
@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public List<Student> getStudents() {
		return repo.findAll();
	}

	public Student add(Student student) {
		return repo.save(student);
	}

}
