package com.DesignPattern.PrototypeDesignPattern;

class Employee implements Cloneable
{

	private int id;
	private String name;
	private String city;
	
	Employee(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public String toString()
	{
		return "id"+" : "+ id + " Name"+" : "+name+ " city"+" : "+city ;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}
public class PrototypePattern 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee e1=new Employee(101, "satish", "Pune");
		System.out.println(e1);
		
		Employee e2=(Employee) e1.clone();
		System.out.println(e2);
	}
}
