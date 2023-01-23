package com.demo1;

public class CountDigitsOfNum {
	
	public static void main(String[] args) {
		
		int num = 7462030;
		int count=0;
		
		while(num>0){
			num=num/10;
			count++;
			}
		System.out.println("count of digits is : "+count);
	}

}
