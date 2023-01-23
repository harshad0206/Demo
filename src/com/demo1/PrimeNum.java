package com.demo1;

import java.util.Scanner;

public class PrimeNum {
	
public static void main(String[] args) {
		
		System.out.println("enter the number");
		
     Scanner s = new Scanner (System.in);
     int no = s.nextInt();
     int count = 0 ;
     
     for(int i= no;i>0;i--) {
    	 if(no % i == 0) {
    		 
    		 count++;
    		 
    	 }
     }
    	 if (count > 2) {
    	 System.out.println("number is not prime");
    	 }
    	 else {
    		 System.out.println("number is prime");
    	 }
     }
	}


