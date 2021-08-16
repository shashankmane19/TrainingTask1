package com.basic.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.springboot.entity.Student;

@RestController
@RequestMapping("/students")
public class ApplicationController {
	
	Student stud=new Student();
	
	@PostMapping("/add")
	public String addStudent (@RequestBody String student) {
		
		stud.setStudName(student);
		return "student added successfully";
	}

	
	@GetMapping("/fetch")
	public String fetchStudent () {
		
		return stud.getStudName();
	}

	
	
	@PutMapping("/update")
	public String updateStudent (@RequestBody String student) {
		
		stud.setStudName(student);
		return "student updated successfully";
	}
	
	

}

