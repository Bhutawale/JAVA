package com.KrishnaSandeep_Youtube_Programs;

public class PalindromString 
{
	public static boolean isPalindrom(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		String reverse = sb.reverse().toString();
		if(str.equals(reverse))
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		String str="satish";
		boolean palindrom = isPalindrom(str);
		if(palindrom)
			System.out.println("Palindrom String");
		else
			System.out.println("Not Palindrom String");
	}
}
