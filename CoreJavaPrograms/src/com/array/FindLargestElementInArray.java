package com.array;

public class FindLargestElementInArray {
	
	public static void main(String[] args) {
		int[] arr = { 25,11,7,74,56 };
		int max= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> max) 
				max=arr[i];
			}
			System.out.println("finding largest element in array:::"+ max);
		}

}
