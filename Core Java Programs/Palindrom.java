package com.method;

import java.util.Scanner;

public class Palindrom 
{
	static int num;
	public static void check(int num)
	{
		int rev=0;
		int onum=num;
		if(num>9)
		{
			while(num!=0)
			{
				int temp=num%10;
				rev=rev*10+temp;
				num=num/10;
			}
			if(onum==rev)
			{
				System.out.println("Number is Palindrom");
			}
			else
			{
				System.out.println("Number is not Palindrom");
			}
		}
		else
		{
			System.out.println("All numbers between 1 and 9 are Palindrom in itself!!");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		check(num);
	}
}
 