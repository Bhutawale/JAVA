package com.method;

import java.util.Scanner;

public class Array_SearchElement 
{
	public void search(int[] arr,int num)
	{
		boolean found=false;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==num)
			{
				System.out.println("Element found at position: "+(j+1));
				found=true;
				break;
			}	
		}
		if(!found)
		{
			System.out.println("Element Not found");
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,40,50};
		System.out.println("Original Array: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be searched: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Array_SearchElement a=new Array_SearchElement();
		a.search(arr,num);
	}
}
