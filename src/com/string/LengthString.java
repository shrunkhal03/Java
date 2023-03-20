package com.string;

import java.util.Scanner;

public class LengthString {
	public static String getReverse( String name) {
		//String name  = "Shrunkhal";
	String rev="";
	
		System.out.println(name.length());
		for (int i=name.length()-1;i>=0;i--) {
		char ch = name.charAt(i);
		rev = rev +ch;
		
		}return rev;//System.out.println(rev);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String >>");
		Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	
	//String name1=getReverse(name);
	System.out.println(getReverse(name));
	
	
}}
