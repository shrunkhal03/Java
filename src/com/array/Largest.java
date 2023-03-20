package com.array;

public class Largest {

	public static void main(String[] args) {
		int a[]= {75,100,85,81,786};
		int larg =a[0];
		for (int i=0;i<a.length;i++){
			if (a[i]>larg) {
				larg=a[i];
			
			}
		}
			System.out.println(larg);
		}
		

	}


