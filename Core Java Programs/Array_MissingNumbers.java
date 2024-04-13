package com.method;

public class Array_MissingNumbers {
    public void missing(int[] a, int[] b) {
        int[] missing = new int[a.length];
        int count = 0;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            found = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missing[count] = a[i];
                count++;
            }
        }

        System.out.println("Missing numbers: ");
        for (int k = 0; k < count; k++) {
            System.out.println(missing[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[] { 1, 5 };
        Array_MissingNumbers a = new Array_MissingNumbers();
        a.missing(arr1, arr2);
    }
}
