package com.method;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void Armstrong(int num)
	{
		String str_num = Integer.toString(num);
		int length = str_num.length();
		int onum=num;
		int sum=0;
		while(num>0)
		{
			int n=num%10;
			sum=(int) (sum+Math.pow(n, length));
			num=num/10;
		}
		if(sum==onum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Armstrong(num);
		scan.close();
	}
}
