package com.array;

public class Students {

	public static void main(String[] args) {
		int [] marks= {90,5,54,98,182,8558};
		System.out.println(marks);
		
		for (int i=0;i<marks.length;i++) {
		for (int j=i+1; j<marks.length;j++) {
				if (marks[i]<marks[j]) {
					int x = marks[i]; //90>54 
					marks[i]=marks[j];
					marks[j]=x;
					//System.out.println(marks[i]);
					 
				
					}	
				}
		}
		      System.out.println("Acsending order");
				for (int i=0;i<marks.length;i++) {
					//System.out.println(marks[1]);
		}		System.out.println(marks[1]);

	

}
}