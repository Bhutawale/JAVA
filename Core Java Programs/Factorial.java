package com.method;

import java.util.Scanner;

public class Factorial
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int factorial = factorial(num);
		System.out.println("The factorial of a given number is: "+factorial);
	}
}
