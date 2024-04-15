package com.Java_8_Programs;

import java.util.List;

public class Professor 
{
	int id;
	String firstname;
	int age;
	String gender;
	String department;
	String city;
	int rank;
	List<String> contacts;
	
	
	public Professor(int id, String firstname, int age, String gender, String department, String city, int rank,
			List<String> contacts) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public List<String> getContacts() {
		return contacts;
	}
	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "Professor [id=" + id + ", firstname=" + firstname + ", age=" + age + ", gender=" + gender
				+ ", department=" + department + ", city=" + city + ", rank=" + rank + ", contacts=" + contacts + "]";
	}
	
	
	
}
