package com.array;

public class Consonants {

	public static void main(String[] args) {
		String name = " My name is Shrunkhal";
		int count =0;
		for (int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z'))) {
				count++;//System.out.println(ch);
			}
		}
		System.out.println(count);
	}

}
