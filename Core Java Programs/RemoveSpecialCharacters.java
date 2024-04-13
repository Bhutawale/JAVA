package com.method;

public class RemoveSpecialCharacters 
{
	public static void main(String[] args) {
		
	
		String str="satish!@#%^&*( Bhutawale";
	
		String newstr = str.replaceAll("[^a-zA-Z0-9]", ""); //using regular expression
		
		System.out.println(newstr);
	}
}
