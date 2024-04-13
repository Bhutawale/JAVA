package com.method;

public class RemoveWhiteSpaces 
{
	public void remove(String str)
	{
		String replace = str.replace(" ", "");
		System.out.println(replace);
	}
	public static void main(String[] args) {
		String str="Hello World How Are You";
		RemoveWhiteSpaces w=new RemoveWhiteSpaces();
		w.remove(str);
	}
}
