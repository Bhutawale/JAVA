package com.method;

import java.util.Scanner;

public class Recursion_Factorial 
{
	public int fact(int num)
	{ 
		if(num==1 || num==0)
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Recursion_Factorial f=new Recursion_Factorial();
		int fact = f.fact(num);
		System.out.println("The Factorial of a number is: "+fact);
	}
}
