package com.demo1;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num=scan.nextInt();
	
	int org_num = num;
	
	int rev = 0;
	while(num!= 0){
		rev=rev*10 + num%10;
		num=num /10;
	}
	if(org_num==rev) {
		System.out.println(" palindrome number = "+ org_num);
	}
	else {
		System.out.println(" not palindrome number = "+ org_num);
	}

}
}