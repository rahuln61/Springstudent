package com.test.altimetrik.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.test.altimetrik.model.User;

public class UserCrudService {
	private static List<User> userList = new ArrayList<>();
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public boolean addUser(User user) {
		System.out.println(userList.size()+" : call came with  user : "+user);
		
		return userList.add(user);
	}
	
	public  List<User> getAllUser(){
		return getUserList();
	}

	
	public User getUserByid(String id) {
		return userList.stream().filter(u->u.getName().equals(id)).collect(Collectors.toList()).get(0);
	}
	
	public User updateUserByid(User user) {
		return userList.stream().filter(u->u.getName().equals(user.getName()))
				.map(u -> user).collect(Collectors.toList()).get(0);
	}
	

	static {
		 userList = Arrays.asList(new User("Jack Markal","Jack@vmail.com","981234"),
		new User("Swat shrm","swat@vmail.com","123"),
		new User("Chirag Morgan","chirag@vmail.com","12312"),
		new User("Morgan Charly","morgan@vmail.com","23456"),
		new User("Param Sach","param@vmail.com","12345"));
	}
}
