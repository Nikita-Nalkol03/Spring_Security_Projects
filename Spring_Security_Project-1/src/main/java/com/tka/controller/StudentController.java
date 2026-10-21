package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student;
import com.tka.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/get")
	public List<Student> getStudents(){
		return service.getStudents();
	}
	
	@PostMapping("/add")
	public Student add(@RequestBody Student student){
		return service.add(student);
	}

	@PostMapping("/register")
    public String register(@RequestBody Student student) {
        // UserService se user register karna
        return "User registered successfully";
    }
}
