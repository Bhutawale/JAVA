package com.KrishnaSandeep_Youtube_Programs;

public class ArrayRotation 
{
	public static int[] rotateBy(int[] arr,int rotateby)
	{
		int[] temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			temp[(i+rotateby)%arr.length]=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
		}
		System.out.println("Array after rotation: ");
		
		return arr;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		int rotateby=2;
		int[] rotateBy2 = rotateBy(arr,rotateby);
		for(int n:rotateBy2)
			System.out.print(n+" ");
	}
}
