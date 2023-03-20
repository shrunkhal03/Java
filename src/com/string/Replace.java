package com.string;

public class Replace {

	public static boolean getReplace(String s1,String s2){
		
		
		return(s1.length()==s2.length()&& ((s1+s2).indexOf(s2)!=-1)) ;
		
	}
	
	
	public static void main(String[] args) {
		String s1= "abcd";
		String s2 = "cdab";
		
		if (getReplace(s1,s2)) {
			System.out.println("rotation is present");
		}
		else {
			System.out.println("rotation is not present");
		}
	
		//Character.isDigit (charAt[0]);
}}	
