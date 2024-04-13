package com.Java_8_Programs;

@FunctionalInterface
interface inter1
{
	public void reverse(int num);
}

public class FI_1 
{
	public static void main(String[] args) 
	{
		int num=123;
		inter1 i=(n)->
		{
			int rev=0;
			while(n!=0)
			{
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			System.out.println("Reverse Number: "+rev);
		};
		i.reverse(num);
	}
}
