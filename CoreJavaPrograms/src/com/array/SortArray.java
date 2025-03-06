package com.array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int temp, size;
        int arr[] = {10, 5, 20, 63, 12, 57, 88, 60};
        size = arr.length;

        // Sorting the array manually using Bubble Sort
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Printing 3rd largest number
        System.out.println("3rd largest number: " + arr[size - 3]);

        // Using Arrays.sort() method
        Arrays.sort(arr);
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arr));

        // Printing 3rd largest number after using Arrays.sort()
        int thirdMaxNum = arr[size - 3];
        System.out.println("3rd largest number using Arrays.sort(): " + thirdMaxNum);
    }
}
