package com.prowings.array.exercise;

import java.util.Arrays;

public class SortArrayUsingComparator {

	public static void main(String[] args) {
		
		Integer[] numbers = {10,30,60,20,50,40};
		NumberDecendingComparator obj = new NumberDecendingComparator();
		Arrays.sort(numbers, obj);
		
		System.out.println(Arrays.toString(numbers));
	}
	
}
