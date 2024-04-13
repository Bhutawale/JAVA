package com.method;

public class String_Comparing 
{
	public static void main(String[] args) {
		String s1="satish";
		String s2="satish";
		System.out.println(s1==s2);
		
		String s3=new String("satish");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}
}
