package com.test.altimetrik.model;

public class User {

	private String name;
	private String email;
	private String contact;
	private String active;


	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String name, String email, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

	public String isActive() {
		return active;
	}
	
	
	public void setActive(String active) {
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", contact=" + contact + ", active=" + active + "]";
	}

	
	
}
