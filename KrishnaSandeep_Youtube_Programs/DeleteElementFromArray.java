package com.KrishnaSandeep_Youtube_Programs;

public class DeleteElementFromArray 
{
	public static int[] removeElement(int[] arr,int remove)
	{
		int[] newarr=new int[arr.length-1];
		int index=0;
		
		for(int i:arr) {
			if(i!=remove) {
				newarr[index]=i;
				index++;
			}
		}
		return newarr;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		int remove=3;
		int[] removeElement = removeElement(arr,remove);
		for(int i:removeElement)
			System.out.print(i+" ");
	}
}
