package com.demo1;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number:>");
		int num =scan.nextInt();
		
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial of a number is :> "+factorial);
	}

}
