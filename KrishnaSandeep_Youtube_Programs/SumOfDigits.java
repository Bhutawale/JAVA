package com.KrishnaSandeep_Youtube_Programs;

public class SumOfDigits 
{
	public static int sum(int num)
	{
		int sum=0;
		
		while(num>0)
		{
			int n=num%10;
			sum=sum+n;
			num=num/10;
		}
		
		return sum;
	}
	public static void main(String[] args) 
	{
		int num=123;
		int sum = sum(num);
		System.out.println("Sum of digits: "+sum);
	}
}
