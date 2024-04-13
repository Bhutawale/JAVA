package com.Java_8_Programs;

public class Emp_1 
{
	private String  name;
	private int age;
	private double salary;
	public Emp_1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	@Override
	public String toString() {
		return "Emp_1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
