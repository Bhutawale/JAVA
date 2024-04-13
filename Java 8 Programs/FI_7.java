package com.Java_8_Programs;

@FunctionalInterface
interface inter7
{
	public void multiply(int num1,int num2);
}
public class FI_7 
{
	public static void main(String[] args)
	{
		int num1=10,num2=50;
		
		inter7 i=(n1,n2)->
		{
			int mul=n1*n2;
			System.out.println("Multiplication of two numbers is: "+mul);
		};
		i.multiply(num1, num2);
	}
}
