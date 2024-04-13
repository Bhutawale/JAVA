package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
	String name;
	int salary;
	
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class Function_2 
{	
	public static void main(String[] args) 
	{
		List<Employee> list = Arrays.asList(new Employee("Satish",10000),
				new Employee("Sanskar", 20000),
				new Employee("Sachin", 30000),
				new Employee("Suyog", 40000));
		
		Function<Employee, Integer> f= e->
			{
				int sal=e.salary;
				
				if(sal>10000 && sal<40000)
					return (sal *10/100);
				else
					return (sal*20/100);
					
			};
			
		Predicate<Integer> p=b->b>5000;
			
			for (Employee employee : list) 
			{
				Integer rev_sal = f.apply(employee); //function
				
				if(p.test(rev_sal))              //predicate
				{
					System.out.println(employee.name+"  "+employee.salary);
					System.out.println("employee Bonus :" +rev_sal);
				}
			}
	}
}
