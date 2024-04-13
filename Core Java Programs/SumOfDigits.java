package com.method;

import java.util.Scanner;

public class SumOfDigits 
{
	public static int sumofdigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		 
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sumofdigits = sumofdigits(num);
		System.out.println("The sum of given digit is: "+sumofdigits);
	}
}
