package com.arraylist;

import java.util.ArrayList;

public class Demo {
 
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(11);
		list.add(12);
		list.add(15);
		  Integer[] objects = new Integer[list.size()];
		  list.toArray(objects);
		  
		// Printing array of objects
	        for (Integer obj : objects)
	            System.out.print(obj + " ");
	}
	/*ArrayList <String>array = new ArrayList<>();
	array.add("badshah");
	array.add("bhai");
	array.add("shanku");
	System.out.println(array);
	
	String[] intoArray= new String[array.size()];
	array.toArray(intoArray);
	for(String a : intoArray) {
		System.out.println(a);*/	
	}
	
	

