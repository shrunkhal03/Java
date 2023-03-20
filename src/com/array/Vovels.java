package com.array;

public class Vovels {
	public static void main(String[] args) {
		String name = "Shrunkhal";
		 int count=0; int vcount=0;
		for (int i=0;i<name.length();i++) {
			 char ch = name.charAt(i);
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')  {
				 System.out.println("vowels is>>"+ch);
			// count++;
			 //System.out.println(count);
			}else {
				System.out.println( "consonants is>>>"+ch);
				vcount++;
				
			}	
		}System.out.println(vcount);
	}

}
