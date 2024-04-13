package com.method;

import java.util.Scanner;

public class CountEvenOddDigits 
{
	public void count(int num)
	{
		int count_even=0,count_odd=0;
		int copy=num;
		while(num!=0)
		{
			copy=num%10;
			if(copy%2==0)
			{
				count_even++;
			}
			else
			{
				count_odd++;
			}
			num=num/10;
		}
		System.out.println("Even Digits: "+count_even);
		System.out.println("Odd Digits: "+count_odd);
	}
	public static void main(String[] args) {
	System.out.println("Enter the number: ");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	CountEvenOddDigits c=new CountEvenOddDigits();
	c.count(num);
	}
}
