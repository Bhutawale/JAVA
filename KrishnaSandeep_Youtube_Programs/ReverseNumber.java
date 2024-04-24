package com.KrishnaSandeep_Youtube_Programs;

public class ReverseNumber 
{
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		int num=123;
	int reverse = 	reverse(num);
	System.out.println("Reverse of number: "+reverse);
	}
}
