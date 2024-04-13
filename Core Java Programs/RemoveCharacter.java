package com.method;

public class RemoveCharacter
{
	public void remove(String str)
	{
		char[] arr = str.toCharArray();
		char[] newarr=new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!='s') 
			{
				newarr[i]=arr[i];
			}
		}
		for(int j=0;j<newarr.length;j++)
		{
			if(newarr[j]!=0)
			System.out.print(newarr[j]);
		}
	}
	public static void main(String[] args) {
		String str="satish";
		RemoveCharacter rc=new RemoveCharacter();
		rc.remove(str);
	}
}
