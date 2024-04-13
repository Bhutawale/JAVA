package com.method;

import java.util.Scanner;

public class ReverseNumber 
{
	static int num;
	
	public static void reverse(int n)
	{
		int rev=0;
		if(n>9)
		{
			while(n!=0)
			{
				int temp=n%10;
				rev=rev*10+temp;
				n=n/10;
			}
			System.out.println("The reverse of a given number is: "+rev);
		}
		else
		{
			System.out.println("Reverse of single digit number is the number itself: "+n);
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan =new Scanner(System.in);
		num=scan.nextInt();
		reverse(num);
	}
}
