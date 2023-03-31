package com.prowings.array.exercise;

import java.util.Comparator;

public class NumberDecendingComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		
		if(n1 == n2)
			return 0;
		else if(n1 < n2)
			return 1;
		else
			return -1;
	}

}
