package com.KrishnaSandeep_Youtube_Programs;

public class SumOfnNaturalNumbers 
{
	public static int sumNatural(int n)
	{
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int n=10;
		int sumNatural = sumNatural(n);
		System.out.println(sumNatural);
	}
}
