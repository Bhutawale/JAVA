package com.method;

public class String_CharacterCount 
{
	public void count(String str)
	{
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isWhitespace(str.charAt(i))
					&& str.charAt(i)!=',')
			{
				newstr=newstr+str.charAt(i);
			}
		}
		int length = newstr.length();
		System.out.println("String after removing space and comma :"+newstr + " having characters "+ length);
	}
	public static void main(String[] args) {
		String str="sa,ti ,sh";
		System.out.println("Given String: "+str);
		String_CharacterCount c=new String_CharacterCount();
		c.count(str);
	}
}
