package com.DesignPattern.ShallowCopy;

class Employee implements Cloneable
{
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}
public class ShallowCopyExample 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address=new Address("Karjat", "India");
		
		Employee emp1=new Employee(101, "Satish Bhutawale", address);
		
		
		Employee emp2 =(Employee) emp1.clone(); //cloning object
		
		emp2.address.city="Pune";
		
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
