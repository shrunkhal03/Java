package com.array;

public class SumOfArray {

	public static void main(String[] args) {
		//int a[]=new int[20];
		float a[]= {28.20f,85.55f,55.5f};
		float sum=0;
		for (int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}	
		System.out.println(sum);
}}
