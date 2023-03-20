package com.array;

public class IntegerPresent {

	public static void main(String[] args) {
	int a []= {10,20,50,60};
	int b=70;
	boolean isInArray=false;
	for (int i=0;i<a.length;i++) {
			if (a[i]==b) {
			isInArray=true;	//System.out.println(b+"<<<Integer is preseent>>");
				break;
			}
			}
	 if (isInArray) {
		 System.out.println(b+"<<<Integer is   preseent>>");
	 }
	 else {
		 System.out.println(b+"<<<Integer is not  preseent>>");
	 }
	}
	}
	
	

//}
