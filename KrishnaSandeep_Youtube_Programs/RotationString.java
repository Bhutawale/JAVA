package com.KrishnaSandeep_Youtube_Programs;

public class RotationString 
{
	public static boolean isRotation(String s1,String s2)
	{
		String concat = s1.concat(s1);
		boolean contains = concat.contains(s2);
		if(contains)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		String s1="satish";
		String s2="ishsat";
		boolean rotation = isRotation(s1,s2);
		if(rotation)
			System.out.println("Both Strings are rotation of each other");
		else
			System.out.println("Both Strings are not rotation of each other");
	}
}


