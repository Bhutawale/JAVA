package com.Java_8_Programs;

public class Emp_Data 
{
	int age;
	String name;
	int salary;
	String dept;
	String gender;
	int joining;
	
	public Emp_Data(int age, String name, int salary, String dept, String gender, int joining) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.gender = gender;
		this.joining = joining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getJoining() {
		return joining;
	}
	public void setJoining(int joining) {
		this.joining = joining;
	}
	@Override
	public String toString() {
		return "Emp_Data [age=" + age + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", gender="
				+ gender + ", joining=" + joining + "]";
	}
}
