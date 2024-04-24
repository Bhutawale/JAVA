package com.KrishnaSandeep_Youtube_Programs;

public class Factorial 
{
	public static int fact(int num)
	{
		int fact=1;
		if(num==0)
			return 1;
		else
			fact=num*(fact(num-1));
		return fact;
	}
	public static void main(String[] args) 
	{
		int num=5;
		int fact = fact(num);
		System.out.println(fact);
	}
}
