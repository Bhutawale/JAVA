package com.method;

public class RemoveSpecialCharacter 
{
	public void remove(String str)
	{
		String newstring = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("New String: "+newstring);
	}
	public static void main(String[] args) {
		String str="satish@123#";
		System.out.println("Oirginal String: "+str);
		RemoveSpecialCharacter r=new RemoveSpecialCharacter();
		r.remove(str);
	}
}
