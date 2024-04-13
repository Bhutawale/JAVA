package com.method;

import java.util.Scanner;

public class OddEven
{
	static int num;
	
	public void check(int n)
	{
		if(n%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		OddEven o=new OddEven();
		o.check(num);
	}
}
