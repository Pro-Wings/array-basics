package com.prowings.array;

import java.util.Arrays;

public class ArrayCopyDemo2 {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		
		int[] numbersCopy = Arrays.copyOfRange(numbers, 4, 7);
		
		System.out.println(Arrays.toString(numbersCopy));
		
		System.out.println(numbers == numbersCopy);
		
	}

	
}
