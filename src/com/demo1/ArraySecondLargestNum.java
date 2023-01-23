package com.demo1;

import java.util.Arrays;

public class ArraySecondLargestNum {
	
	public static void main(String[] args) {
		
		int num[] = {25,35,45,65,77,95};
		
		int n = num.length;
		
		Arrays.sort(num);
		
		System.out.println("second largest num = "+num[n-2]);
	}

}
