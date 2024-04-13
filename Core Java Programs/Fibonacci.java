package com.method;

import java.util.Scanner;

public class Fibonacci 
{
	private static void fibonacci(int limit)
	{
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Fibonacci Series for the given limit is: ");
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<=limit-3;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the limit: ");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		fibonacci(limit);
	}

	
		
}
