package com.Java_8_Programs;

public class Emp_2 
{
	private String name;
	private String city;
	public Emp_2(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emp_2 [name=" + name + ", city=" + city + "]";
	}
	
	
}
