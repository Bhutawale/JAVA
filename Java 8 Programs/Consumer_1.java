package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp
{
	String name;
	int salary;
	
	Emp(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
public class Consumer_1 
{
	public static void main(String[] args) 
	{
		List<Emp> list = Arrays.asList(new Emp("Satish", 10000),
				new Emp("Sanskar", 20000),
				new Emp("Sanskruti", 30000),
				new Emp("sachin", 40000),
				new Emp("Suyog", 50000));
		
		Function<Emp, Integer> f=e->
								{
									int sal=e.salary;
									if(sal>=10000 && sal<=30000)
										return (sal*10/100);
									else if(sal>=30000 && sal<=40000)
										return (sal*20/100);
									else
										return (sal*30/100);
								};
								
		Predicate<Integer> p=b->b>5000;
		
		Consumer<Emp> c=em->
		{
			System.out.println(em.name);
			System.out.println(em.salary);
		};
		
		for(Emp emp:list)
		{
			Integer bonus = f.apply(emp);
			
			if(p.test(bonus))
			{
				c.accept(emp);
				System.out.println("Employee Bonus: "+bonus);
			}
		}
		
	}
}
