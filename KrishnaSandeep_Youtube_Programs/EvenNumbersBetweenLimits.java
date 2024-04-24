package com.KrishnaSandeep_Youtube_Programs;

public class EvenNumbersBetweenLimits 
{
	public static void evenNumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		int n=10;
		evenNumbers(n);
	}
}
