package com.basic;

public class Swapping {

	public void SwapNumber(int a, int b) {
		System.out.println("Before swapping value of a and b is:"+ "a = "+ a + " " + "b=" + b);
		a= a+b;
		b=a-b;
		a=a-b;
		
	System.out.println("After swapping value of a and b is:" + "a= " + a +" " +  "b=" + b);
	}
	
	public static void main(String[] args) {
		Swapping swap = new Swapping();
		swap.SwapNumber(10 , 50);
	}
}