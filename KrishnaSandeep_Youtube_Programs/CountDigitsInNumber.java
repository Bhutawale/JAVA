package com.KrishnaSandeep_Youtube_Programs;

public class CountDigitsInNumber 
{
	public static int countDigits(int num)
	{
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		return count;
	}
	public static void main(String[] args) 
	{
		int num=1236819;
		int digits = countDigits(num);
		System.out.println(digits);
	}
}
