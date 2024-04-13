package com.method;

public class DifferenceStringEquals 
{
	public static void main(String[] args) {
		String s1="satish";
		String s2=new String("satish");
		String s3="satish";
		System.out.println(s1==s2); // matches references/addresses.
		System.out.println(s1.equals(s2)); //matches actual content.
		System.out.println(s1==s3); // since both strings are created using literals so both objects point to same content so true.
	}
}
