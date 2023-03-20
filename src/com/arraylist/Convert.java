package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert {
	
	public static void main(String[] args) {
		String a[] = {"tcs","wipro","djjango"};
		for(String b : a) {
			System.out.println(b);
		}
		// convert array to arraylist 
		
	 
		
		List<String> array = Arrays.asList(a);
		
		System.out.println(array);
		
		
		
	}

}
