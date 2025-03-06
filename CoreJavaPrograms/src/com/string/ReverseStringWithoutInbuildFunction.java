package com.string;

public class ReverseStringWithoutInbuildFunction {
	
	public String ReverseString(String input) {
		char[] chars=input.toCharArray();
		int left=0, right=chars.length-1;
		while(left < right) {
			char temp= chars[left];
			chars[left]= chars[right];
			chars[right]=temp;
			left++;
			right--;
		}
		return new String(chars);
	}
	
	public static void main(String[] args) {
		ReverseStringWithoutInbuildFunction rs =new ReverseStringWithoutInbuildFunction();
		String name= rs.ReverseString("Akanksha");
		System.out.println("Reverse String is:"+ name );
	}

}
