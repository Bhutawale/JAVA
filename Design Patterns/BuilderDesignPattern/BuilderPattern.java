package com.DesignPattern.BuilderDesignPattern;

class Employee 
{
	private int id;
	private String name;
	private String city;
	
	private Employee(EmpBuilder builder)
	{
		this.id=builder.id;
		this.name=builder.name;
		this.city=builder.city;
	}
	
	
		
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}



	public static class EmpBuilder
	{
		private int id;
		private String name;
		private String city;
	

	public EmpBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public EmpBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public EmpBuilder setCity(String city) {
		this.city = city;
		return this;
	}
	
	public Employee build()
	{
		return new Employee(this);
	}
	}
}
public class BuilderPattern
{
	public static void main(String[] args) {
		
	
	Employee e1=new Employee.EmpBuilder()
						.setId(101)
						.setName("Satish")
						.build();
	System.out.println(e1);
	}	
}
