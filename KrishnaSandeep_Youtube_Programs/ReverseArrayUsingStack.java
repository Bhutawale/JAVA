package com.KrishnaSandeep_Youtube_Programs;

import java.util.Stack;

public class ReverseArrayUsingStack 
{
	public static int[] reverse(int[] arr)
	{
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			st.push(arr[i]);
		}
		for(int  i=0;i<arr.length;i++)
		{
			arr[i]=(int)st.pop();
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,4,5,6,7};
		int[] reverse = reverse(arr);
		for(int n:reverse)
			System.out.print(n+",");
	}
}
