package com.demo1;

import java.util.Scanner;

public class ReverseNUM {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number > ");
		int num = scan.nextInt();
		
		//1st way using algoritham
		
		  int rev = 0; while(num!=0) 
		  { rev = rev*10 + num%10;
		  num = num/10;
		
		  }
		  System.out.println("reverse number is "+rev);
		 
		// 2nd way using string buffer class
		
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println("reverse number is "+rev);
	}

}
