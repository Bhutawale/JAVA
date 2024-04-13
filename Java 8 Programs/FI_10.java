package com.Java_8_Programs;

@FunctionalInterface
interface interf10
{
	public void reverse(String str);
}
public class FI_10 
{
	public static void main(String[] args) 
	{
		String str="satish";
		interf10 i=(s)->
		{
			StringBuffer sb=new StringBuffer(s);
			StringBuffer reverse = sb.reverse();
			System.out.println("The reverse of string is: "+reverse);
		};
		i.reverse(str);
	}
}
