package com.prowings.array.exercise;

import java.util.Arrays;

public class CopyAnArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,40,30,20,50};
		
		int[] numbersCopy = numbers.clone();
		
		System.out.println(Arrays.toString(numbersCopy));
		
		System.out.println(numbers == numbersCopy);
		
		
	}

}
