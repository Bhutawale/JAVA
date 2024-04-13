package com.method;

import java.util.Scanner;

public class CountDgits 
{
	public void countdigits(int num)
	{
		int count=0;
		int copy=num;
		while(num!=0)
		{
			copy=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Number of digits in given number: "+count);
	}
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		CountDgits c=new CountDgits();
		c.countdigits(num);
	}
}
