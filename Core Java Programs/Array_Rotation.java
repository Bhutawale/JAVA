package com.method;

public class Array_Rotation
{
	public void rotate(int[] arr,int rotateby)
	{
		int[] temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			temp[(i+rotateby)% arr.length]=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
		}
		System.out.println("Array after rotation: ");
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,2,3,4,5};
		int rotateby=2;
		System.out.println("Original Array: ");
		for(int n:arr)
			System.out.print(n+" ");
		System.out.println();
		Array_Rotation r=new Array_Rotation();
		r.rotate(arr,rotateby);
	}
}
