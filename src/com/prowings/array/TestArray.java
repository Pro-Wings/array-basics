package com.prowings.array;

public class TestArray {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		
		System.out.println(s.getClass().getName());
		
		Integer i = 20;
		
		System.out.println(i.getClass().getName());
		
		int[] numbers = {10,20,30,40,50};
		float[] numbers2 = {10,20,30,40,50};
		double[] numbers3 = {10,20,30,40,50};
		long[] numbers4 = {10,20,30,40,50};

		Integer[] numbers5 = {10,20,30,40,50};
		String[] numbers6 = {"a", "b"};
		

		System.out.println(numbers.getClass().getName());
		System.out.println(numbers2.getClass().getName());
		System.out.println(numbers3.getClass().getName());
		System.out.println(numbers4.getClass().getName());
		System.out.println(numbers5.getClass().getName());
		System.out.println(numbers6.getClass().getName());
	}

}
