package com.method;

public class LowerUpper
{
	public static void main(String[] args) {
		String str="CloudTech";
		String newstr="";
		char[] array = str.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			if(Character.isUpperCase(array[i]))
			{
				newstr=newstr+Character.toLowerCase(array[i]);
			}
			else if(Character.isLowerCase(array[i]))
			{
				newstr=newstr+Character.toUpperCase(array[i]);
			}
		}	
		System.out.println(newstr);
	}
}
