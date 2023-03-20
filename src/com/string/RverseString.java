package com.string;

public class RverseString {

	public static void main(String[] args) {
		String name ="Shrunkhal";
		String rev ="";
		for (int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			rev = rev +ch;
		}
		System.out.println("reverse of the string is "+rev);
	}

}
