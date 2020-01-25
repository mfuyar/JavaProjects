package com.sprintqa.hava.class10;

import java.util.Scanner;

public class patternlogical2 {

	public static void main(String[] args) {
	
		// number is prime or not
		//Scanner myObj = new Scanner(System.in);
		// int age = myObj.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		long num = sc.nextInt();
				
		
			for (int j = 2; j <= 10; j++)

			if (num!=2 && num%j==0 || num%(j+1)==0) {
				
				//System.out.println(j);
				//if (j>1) {
					System.out.println("Number is not prime");
					break;
				} else {
					System.out.println("Prime number");
					break;
				}
		
	}
}
				
			


