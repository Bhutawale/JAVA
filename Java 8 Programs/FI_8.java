package com.Java_8_Programs;

@FunctionalInterface
interface interf8
{
	public void sum(int num);
}

public class FI_8 
{
	public static void main(String[] args) 
	{
		
		interf8 i=(num)->
		{
			int sum=0;
			while(num>0)
			{
				int n=num%10;
				sum=sum+n;
				num=num/10;
			}
			System.out.println("Sum of given numbers is: "+sum);
		};
		i.sum(123);
	}
}
