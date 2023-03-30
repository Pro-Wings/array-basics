package com.prowings.array;

import java.util.Arrays;

public class ArrayCopyDemo {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		
//		int[] copyNumbers = numbers;
		
//		int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
		
//		int[] copyNumbers = new int[numbers.length];
		
//		System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
		
		int[] copyNumbers = copyGivenArray(numbers);
		
		System.out.println(Arrays.toString(copyNumbers));
		
		System.out.println(numbers == copyNumbers);
		
	}

	
	public static int[] copyGivenArray(int[] input)
	{
		int[] inputCopy = new int[input.length];
		
		for(int i=0; i<input.length; i++)
		{
			inputCopy[i] = input[i];
		}
		
		return inputCopy;
	}
}
