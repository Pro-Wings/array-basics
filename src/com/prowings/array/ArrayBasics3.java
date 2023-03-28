package com.prowings.array;

import java.util.Arrays;

public class ArrayBasics3 {
	
	public static void main(String[] args) {
		
		Object[] myArr = {10,"hello", true, 30.5f, 'c', "hii"};
		
		System.out.println("Length of array : " +myArr.length);
		
		System.out.println(myArr[0].getClass().getName());
		System.out.println(myArr[1].getClass().getName());
		System.out.println(myArr[2].getClass().getName());
		System.out.println(myArr[3].getClass().getName());
		System.out.println(myArr[4].getClass().getName());
		
		System.out.println("processing only elements of type String : ");
		for(int i=0; i<myArr.length; i++)
		{
			if(myArr[i] instanceof String)
			{
				System.out.println(myArr[i]);
			}
		}
		
	}

}
