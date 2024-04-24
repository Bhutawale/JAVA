package com.KrishnaSandeep_Youtube_Programs;

public class RemoveDuplicateChar 
{
	public static void main(String[] args) 
	{
		String str="satish";
		String newstr="";
		
		for(int i=0;i<str.length();i++)
		{
			boolean found=false;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					found=true;
					break;
				}
			}
			if(!found)
			{
				newstr=newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);
	}
}
