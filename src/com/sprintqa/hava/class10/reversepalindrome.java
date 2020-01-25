package com.sprintqa.hava.class10;

import java.util.Scanner;

public class reversepalindrome {

	public static void main(String[] args) {
Scanner sc =  new Scanner (System.in);
		
		System.out.println("write a number");
		int	num1= sc.nextInt();
		
		int nump=num1;
		
		int reverse=0, lastdigit;
		
		
		while (num1!=0) {
			lastdigit = num1%10;
			reverse = reverse*10+lastdigit;
			
			num1 = num1/10;
			
		}	System.out.println(reverse);
		
		if (nump==reverse) {
			
			System.out.println("It is palindrome");
		}else  {
			System.out.println("It is not palindrome number");
		}
			
	}

}
