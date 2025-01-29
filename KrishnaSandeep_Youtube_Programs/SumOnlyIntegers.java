package com.programs;

public class SumOnlyIntegers 
{
	static int sumOnlyIntegers(String[] array)
	{
		int sum=0;
		
			for(String s:array)
			{
				try 
				{
					int num = Integer.parseInt(s);
					sum=sum+num;
				}
			
				catch (Exception e) 
				{
					System.out.println("skipping String: "+s);
				}
			}
		return sum;
	}
	public static void main(String[] args) 
	{
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
		int sumOnlyIntegers = sumOnlyIntegers(array);
		System.out.println("Total sum: "+sumOnlyIntegers);
	}
}
