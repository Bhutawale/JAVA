package com.Java_8_Programs;

public class Employee_Data
{
	int id;
	int salary;
	
	Employee_Data(int id,int salary)
	{
		this.id=id;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee_Data [id=" + id + ", salary=" + salary + "]";
	}
	
	
}
