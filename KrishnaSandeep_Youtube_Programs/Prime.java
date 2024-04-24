package com.KrishnaSandeep_Youtube_Programs;

public class Prime 
{
	public static boolean isPrime(int num)
	{
		int count=0;
		if(num>=1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		int num=3;
		boolean prime = isPrime(num);
		if(prime)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}
}
