package com.array;

import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		char inputArray[]= { 'a','k','a','n','k','s','h','a'};
		
		String result= new String(new String(inputArray)
				.chars()
				.distinct()
				.mapToObj(c->(char) c)
				.collect(Collectors.toList())
				.toString()
				);	
		
		System.out.println("After removing duplicate character in array:: "+ result);
	}
	

				
}
