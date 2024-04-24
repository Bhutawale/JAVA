package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci
{
	public static List<Integer> fibonacci(int limit)
	{
		List<Integer> list=new ArrayList<Integer>();
		
		int n1=0,n2=1;
		int n3=0;
		list.add(n1);
		list.add(n2);
		for(int i=2;i<limit;i++)
		{
			n3=n1+n2;
			list.add(n3);
			n1=n2;
			n2=n3;
			
		}
		return list;
 	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit=scan.nextInt();
		List<Integer> fibonacci = fibonacci(limit);
		fibonacci.stream().forEach(System.out::println);
		scan.close();
			
	}
}
