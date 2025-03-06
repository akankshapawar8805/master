package com.array;

import java.util.Arrays;

public class FindingSecondLargestSecondSmallestNumber {
	
	public static void main(String[] args) {
		int arraylist[]= { 4,2,3,1,5,7,8,9,6,0};
		int num= arraylist.length;
		Arrays.sort(arraylist);
		
		System.out.println("Finding second largest number is :"+ arraylist[num-2]);
		
		System.out.println("Finding second smallest number is:"+ arraylist[1] ); 
	}

}
