package com.demo1;

import java.util.Scanner;

public class LargestNum {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a =scan.nextInt();
		System.out.println("Enter Second number: ");
		int b =scan.nextInt();
		System.out.println("Enter Third number: ");
		int c =scan.nextInt();
		
		//1st way
//		if(a>b && a>c) {
//			System.out.println(a+ " <is largest number");
//		}
//		else if(b>a && b>c) {
//			System.out.println(b+ " <is largest number");
//		}else {
//			System.out.println(c+ " <is largest number");
//		}
		
		
		//2nd way Ternary operator
		int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		//System.out.println(largest2 + " is largest number");
		
		
		//Direct way
		int largest=c>(a>b?a:b)?c:a>b?a:b;
		System.out.println(largest + " is largest number");
	}

}
