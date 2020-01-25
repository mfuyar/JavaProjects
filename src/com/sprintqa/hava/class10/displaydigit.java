package com.sprintqa.hava.class10;

import java.util.Scanner;

public class displaydigit {

	public static void main(String[] args) {

		Scanner sc =  new Scanner (System.in);
		
		System.out.println("write a number");
		int	num1= sc.nextInt();
		
		
		while (num1!=0) {
			
			System.out.println(num1%10);
			num1 = num1/10;
		}
		
		
		
		// they are both, 
		
		
		/*int result = num1%10;
		
		num1 = num1/10;
		
		int result1 = (num1)%10;
		num1 = num1/10;
		
		int result2 = num1%10;
		num1 = num1/10;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	*/
	}
		
	
		
		
		
		
		
	}


