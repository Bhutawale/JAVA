package com.KrishnaSandeep_Youtube_Programs;

import java.util.Scanner;

public class MatrixPrinting 
{
	public static void printMatrix(int r,int c)
	{
		Scanner s=new Scanner(System.in);
		int[][] matrix=new int[r][c];
		System.out.println("Enter elements into the array: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=s.nextInt();
			}
		}
		System.out.println("Matrix: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
		
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter row size: ");
		int r=scan.nextInt();
		System.out.println("Enter column size: ");
		int c=scan.nextInt();
		printMatrix(r,c);
		scan.close();
	}
}
