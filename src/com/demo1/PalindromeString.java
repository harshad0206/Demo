package com.demo1;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=scan.next();
		String org_str=str;
		String rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
