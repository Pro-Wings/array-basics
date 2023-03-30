package com.prowings.array;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] numbers = { 10, 2, 5, 1 };

		System.out.println(">>>>>>>>>>>>> "+Arrays.binarySearch(numbers, 89));
		
		int[] sortednumbersay = sortGivennumbersay(numbers);

		System.out.println(Arrays.toString(sortednumbersay));
		
		
		
	}

	private static int[] sortGivennumbersay(int[] numbers) {

//		Arrays.sort(numbers);
	       int temp = 0; 

	       for (int i = 0; i < numbers.length; i++) { 
	           for (int j = i+1; j < numbers.length; j++) 
	           { if(numbers[i] > numbers[j]) 
	           		{ 
	                 temp = numbers[i]; 
	                 numbers[i] = numbers[j]; 
	                 numbers[j] = temp; 
	           		} 
	           } 
	       } 		
		return numbers;
	}

	
	
	
	
	
}
