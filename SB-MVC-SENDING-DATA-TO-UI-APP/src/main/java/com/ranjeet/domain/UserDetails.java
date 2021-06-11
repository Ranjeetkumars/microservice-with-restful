package com.ranjeet.domain;

public class UserDetails {
	
	private String id;
	private String firstName;
	private String LastName;
	private String dob;
	private String gender;
	
	
	
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
