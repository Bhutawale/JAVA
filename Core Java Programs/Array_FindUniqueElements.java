package com.method;

public class Array_FindUniqueElements {
    public void findunique(int[] arr) {
        int[] newarr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                newarr[index] = arr[i];
                index++;
            }
        }
        System.out.println("Unique Elements Array: ");
        for (int n : newarr) {
            if (n != 0) {
                System.out.print(n + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 3, 4, 5, 5 };
        System.out.println("Original Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        Array_FindUniqueElements f = new Array_FindUniqueElements();
        f.findunique(arr);
    }
}
