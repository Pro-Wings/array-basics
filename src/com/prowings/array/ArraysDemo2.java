package com.prowings.array;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {

		int[] numbers = { 10, 2, 5, 1 };


		int[] copyOfNumbers = Arrays.copyOf(numbers, 2);
		
		System.out.println(Arrays.toString(copyOfNumbers));
		
		
	}

	
}
