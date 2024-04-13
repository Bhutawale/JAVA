package com.Java_8_Programs;

interface inter6
{
	public void largest(int n1,int n2,int n3);
}
public class FI_6 
{
	public static void main(String[] args) 
	{
		int num1=220,num2=150,num3=1000;
		
		inter6 i=(n1,n2,n3)->
							{
								if(n1>n2 && n1>n3)
									System.out.println("n1 is largest");
								else if(n2>n1 && n2>n3)
									System.out.println("n2 is largest");
								else
									System.out.println("n3 is largest");
							};
							i.largest(num1, num2, num3);
		
	}
}
