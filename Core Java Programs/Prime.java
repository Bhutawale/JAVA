package com.method;

import java.util.Scanner;

public class Prime 
{
	int num;
	
	public static void check(int n)
	{
		int count=0;
		
		if(n>1)
		{
			for(int i=n;i>=1;i--)
			{
				if(n%i==0)
				{
				 	count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println("Number is Prime");
			}
			else
			{
				System.out.println("Number is not Prime");
			}
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		check(num);
		scan.close();
	}
}
