package com.sprinqa.java.class4;

import java.util.Scanner;

public class assignments2 {

	public static void main(String[] args) {

		long num1, num2, userInput;
		Scanner sc = new Scanner(System.in);
		   
	    System.out.println("Enter number GITTTT ");
	    num1 = sc.nextInt();
	    
	    System.out.println("Enter number 2");
	    num2 = sc.nextInt();
	    
	    System.out.println("Select operation (1 for ad, 2 for sub, 3 for mult, 4 for div");
	    userInput = sc.nextInt();
	    

		if (userInput==1) {
			System.out.println(num1+num2);
		} else if (userInput==2) {
			System.out.println(num1-num2);
		}else if (userInput==3) {
			System.out.println(num1*num2);
		}else if (userInput==4 && num2 == 0) {
			System.out.println("Number cannot be dividen by 0");
		}else	
		{System.out.println(num1/num2);
	}	
			
		}
	    
	    
	}

