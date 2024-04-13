package com.method;

import java.util.Scanner;

public class RotationString 
{
	public void check(String S1,String S2)
	{
		String concat = S1.concat(S1);
		boolean contains = concat.contains(S2);
		if(contains)
		{
			System.out.println("Rotation Strings");
		}
		else
		{
			System.out.println("Not Rotation Strings");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter String s1: ");
		Scanner s1=new Scanner(System.in);
		String S1=s1.next();
		System.out.println("Enter String s2: ");
		Scanner s2=new Scanner(System.in);
		String S2=s2.next();
		RotationString r=new RotationString();
		r.check(S1,S2);
	}
}
