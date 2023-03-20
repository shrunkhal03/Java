package com.array;

public class MissingNum {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,7,9 };
		int num =a.length+1;
	int expect_num=num*((num+1)/2);
	//System.out.println(expect_num);
	int sum =0;
	for (int i :a) {
		sum=sum+i;
	}
		System.out.println( expect_num-sum);
		

}
}