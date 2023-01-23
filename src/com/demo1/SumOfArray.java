package com.demo1;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {9,6,3,8,7,5};
		
		int sum=0;
		//1st way
//		for(int i=0;i<=a.length-1;i++) {
//			sum=sum+a[i];
//		}
		//2nd way Enhanced for loop
		for(int value:a) {
			sum=sum+value;
		}
		
		System.out.println("sum of array elements is:>" +sum);
	}

}
