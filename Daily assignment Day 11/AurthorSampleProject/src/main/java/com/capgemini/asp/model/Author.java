package com.capgemini.asp.model;

public class Author {
	private String name;
	private String email;
	private char gender;
	
//	Constructor
	public Author () { 
		super();
	}
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
//	Getters and Setters
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender = gender; }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author or = (Author) obj;
		if (email == null) {
			if (or.email != null)
				return false;
		} else if (!email.equals(or.email))
			return false;
		if (gender != or.gender)
			return false;
		if (name == null) {
			if (or.name != null)
				return false;
		} else if (!name.equals(or.name))
			return false;
		return true;
	}

	
//	Methods
	public void print() {
		System.out.println(name + " (" + gender + ") at " + email);
	}
	
//	Validators are used here
	public void validateName() {
		if (this.name.isBlank())
			throw new RuntimeException("Name cannot be empty or null");
	}
	public void validateGender() {
		if (!(this.gender =='u' || this.gender == 'm' || this.gender == 'f'))
			throw new RuntimeException("Gender is incorrect");
	}
	public void validateEmail() {
		if (!this.email.contains("@"))
			throw new RuntimeException("Email is not valid");
	}
	
	public void validateAuthor(Author a) {
		a.validateName();
		a.validateEmail();
		a.validateGender();
	}
	
}