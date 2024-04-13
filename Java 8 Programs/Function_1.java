package com.Java_8_Programs;

import java.util.function.Function;

public class Function_1 
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f1=n->
		{
			int rev=0;
			while(n!=0)
			{
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			return rev;
		};
		
		Integer reverse = f1.apply(123);
		System.out.println("Reverse Of number is: "+reverse);
	}
}
