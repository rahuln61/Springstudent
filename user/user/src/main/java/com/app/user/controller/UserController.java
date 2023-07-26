package com.app.user.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.user.model.User;
import com.app.user.service.UserService;


@RestController("/user")
public class UserController {

	@Autowired
	private UserService userService;
	private Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	
	
	@GetMapping
	public String helloString() {
		return "Hello User2";
	}
	
	@PostMapping
	public void createNote(@RequestBody @Valid User user) {
		LOG.info("Create User: name {} ", user.getName());
		userService.createUser(user);
	}
	

}
