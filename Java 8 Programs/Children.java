package com.Java_8_Programs;

public class Children 
{
	int id;
	String name;
	char gender;
	int age;
	public Children(int id, String name, char gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Children [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
