package com.string;

public class WhiteSpace {

	public static void main(String[] args) {
		String name ="My name is Shrunkhal";
		int count =0;
		for (int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if (ch ==' ') {
				count++;
			}
			                 //int a= name.indexOf(' ');	
			}System.out.println(count);
		}
	}


