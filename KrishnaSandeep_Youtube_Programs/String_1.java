package com.programs;

public class String_1 
{
	static void separateStringNumber(String str)
	{
		StringBuilder sbString=new StringBuilder();
		StringBuilder sbNumber=new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				sbString.append(str.charAt(i));
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				sbNumber.append(str.charAt(i));
			}
		}
		String string = sbString.toString();
		int number = Integer.parseInt(sbNumber.toString());
		System.out.println(string);
		System.out.println(number);
	}
	public static void main(String[] args) 
	{
		String str="prithvi123raj";
		separateStringNumber(str);
	}
}
