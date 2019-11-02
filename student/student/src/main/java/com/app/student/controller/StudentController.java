package com.app.student.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.student.model.Student;
import com.app.student.service.StudentService;
import com.app.student.util.ConditionCheck;

@RestController("/student")
public class StudentController {

	private Logger LOG = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public String helloString() {
		return "Hello";
	}
	
	@PostMapping
	public void createNote(@RequestBody @Valid Student student) {
		ConditionCheck.checkRequestElementNotNull(student.getEmail(), "Email cannot be null");
		LOG.info("Create Student: name {} ", student.getName());
		studentService.createStudent(student);
	}
	
}
