package com.prowings.array;

import java.util.Arrays;

public class ArrayBasics2 {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5}; //initializers list
		
		String[] words = {"hello", "hi", "java"};
		
		char[] characters = {'a','e','i','o','u'};
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		for(int i=0; i<words.length; i++)
		{
			System.out.println(words[i]);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		System.out.println(Arrays.toString(characters));
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(numbers));
		
	}

}
