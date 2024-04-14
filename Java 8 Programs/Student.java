package com.Java_8_Programs;

public class Student 
{
	int sid;
	String name;
	String city;
	
	Student(int sid,String name,String city)
	{
		this.sid=sid;
		this.name=name;
		this.city=city;
	}
	
	
	
	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
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



	public String toString()
	{
		return "sid"+ " : "+sid+" "+
				"name"+ " : "+name+" "+
				"city"+ " : "+city;
	}
}
