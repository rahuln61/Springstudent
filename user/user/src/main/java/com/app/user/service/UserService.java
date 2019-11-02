package com.app.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.user.model.User;
import com.app.user.repository.UserRepositoryi;


@Service
public class UserService {
	
	@Autowired
	private UserRepositoryi userRepositoryi;
	
	public User createUser(User user) {
		return userRepositoryi.save(user);
	}
	

}
