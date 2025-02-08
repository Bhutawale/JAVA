package com.DesignPattern.DeepCopy;

class Employee
{
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = new Address(address);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
public class DeepCopyEmployee 
{
	public static void main(String[] args) 
	{
		Address address=new Address("Karjat");
		Employee emp1=new Employee(101, "Satish", address);
		
		
		Employee emp2=new Employee(emp1.id, emp1.name, emp1.address);
		
		emp2.address.city="Pune";
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
