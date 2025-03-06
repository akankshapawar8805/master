package com.array;

import java.util.Arrays;
import java.util.List;

public class FindingFirstLastElement {
	
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(4,6,3,7,8,2);
		int first = list.get(0);
		int last= list.get(list.size()-1);
		System.out.println("First element is:"+ first);
		System.out.println("Last element is:"+ last);
		
	}

}
