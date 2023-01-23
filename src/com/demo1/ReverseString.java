package com.demo1;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//using string concatenation operator
		String str = "Harshad";
		String rev = " ";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);//KGDA
		}
			System.out.println("Reversed string is : "+ rev);
	
	}

}
