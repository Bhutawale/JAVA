package com.method;

public class RemovingOccurancesOfChar 
{
	public void remove(String str)
	{
		String newString = str.replaceAll("[Cc]", "");
		System.out.println("String after removing C character :"+newString);
	}
	public static void main(String[] args) {
		String str="Cloudtech";
		System.out.println("Original String: "+str);
		RemovingOccurancesOfChar c=new RemovingOccurancesOfChar();
		c.remove(str);
	}
}
