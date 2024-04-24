package com.KrishnaSandeep_Youtube_Programs;

public class SumOfFirstAndLastDigit 
{
	public static void sumFirstLastDigit(int num)
	{
		int first=0,last=0,sum=0;
		last=num%10;
		first=num;
		while(first>=10)
		{
			first=first/10;
		}
		sum=first+last;
		System.out.println("First Number: "+first);
		System.out.println("Last Number: "+last);
		System.out.println("Sum of first and last Number: "+sum);
	}
	public static void main(String[] args) 
	{
		int num=123;
		sumFirstLastDigit(num);
	}
}
