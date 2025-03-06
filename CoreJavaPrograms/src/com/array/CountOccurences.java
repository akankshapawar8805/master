package com.array;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
public static void main(String[] args) {
		String str="This is an example";
		HashMap<Character,Integer> count=new HashMap<Character,Integer>();
		char[] arr=str.toCharArray();
		for(char c:arr) {
			if(c!=' ') {
				if(count.containsKey(c)) {
					count.put(c, count.get(c)+1);
				}else {
					count.put(c, 1);
				}
			}
		}
		for(Map.Entry entry : count.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue()+", ");
		}
	}
}
