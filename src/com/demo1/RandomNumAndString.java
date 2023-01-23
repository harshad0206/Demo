package com.demo1;

import java.util.Random;

public class RandomNumAndString {
	
	public static void main(String[] args) {
		//1.random class
		Random random = new Random();
		int num = random.nextInt(1000);
		System.out.println(num);
		
		//2.math class
	//	System.out.println(Math.random()); //for decimal number
		
	}

}
