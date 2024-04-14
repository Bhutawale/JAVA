package com.Java_8_Programs;

public class Patient 
{
	int id;
	String name;
	int bill;
	
	Patient(int id,String name,int bill)
	{
		this.id=id;
		this.name=name;
		this.bill=bill;
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


	public int getBill() {
		return bill;
	}


	public void setBill(int bill) {
		this.bill = bill;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}
}
