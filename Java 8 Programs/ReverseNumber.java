package com.Java_8_Programs;

public class ReverseNumber
{
	public static void main(String[] args) 
	{
		int num=1234;
		
		int i = Integer
				.parseInt(new StringBuffer(Integer.toString(num))
						.reverse().toString());
		
		System.out.println(i);
	}
}
