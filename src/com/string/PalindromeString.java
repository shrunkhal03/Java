package com.string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String rev =""; //nayan 
		System.out.println("Enter any String>>");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		for (int i=name.length()-1;i>=0;i--) {
			char ch = name.charAt(i);
			rev = rev +ch;
		}if (name.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("String is palindrome>>" + name);
		}else {
			System.out.println("not palindrome");
		}

	}

}
