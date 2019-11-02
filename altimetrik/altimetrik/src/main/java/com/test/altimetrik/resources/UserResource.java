package com.test.altimetrik.resources;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.altimetrik.model.User;
import com.test.altimetrik.service.UserCrudService;

@RestController
public class UserResource extends UserCrudService{

	@RequestMapping("api/userRepo/v1")
	public List<User> getAllUser() {
				return getUserList();
				
	}
	@RequestMapping("api/userRepo/v1/{name}")
	public User getUserById(@PathVariable String name) {
		return getUserByid(name);
		
	}
	//@PostMapping(path = "/api/userRepo/v1")
	@RequestMapping(method=RequestMethod.POST)
	public boolean createUser(@RequestBody User user) {
		System.out.println("Post called "+user);
		boolean isAdded =  addUser(user);
		if(isAdded) {			
			getAllUser();
		}
		return isAdded;
	}
	@PutMapping(path = "/api/userRepo/v1")
	public boolean updateUser(@RequestBody User user) {
		return true;
		
	}
	
}
