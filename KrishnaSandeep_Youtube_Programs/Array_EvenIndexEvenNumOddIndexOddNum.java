package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_EvenIndexEvenNumOddIndexOddNum 
{
	 static int[] rearrangeEvenOddIndices(int[] arr) {
	        List<Integer> evenNumbers = new ArrayList<>();
	        List<Integer> oddNumbers = new ArrayList<>();

	        // Separate even and odd numbers
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenNumbers.add(num);
	            } else {
	                oddNumbers.add(num);
	            }
	        }

	        int evenIndex = 0, oddIndex = 0;

	        // Place even numbers at even indices and odd numbers at odd indices
	        for (int i = 0; i < arr.length; i++) {
	            if (i % 2 == 0) {
	                arr[i] = evenNumbers.get(evenIndex++);
	            } else if (i % 2 != 0) {
	                arr[i] = oddNumbers.get(oddIndex++);
	            }
	        }
	        return arr;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
	        rearrangeEvenOddIndices(arr);
	        System.out.println("Rearranged Array: " + Arrays.toString(arr));
	    }
	}
