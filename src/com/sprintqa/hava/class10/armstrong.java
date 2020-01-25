package com.sprintqa.hava.class10;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {

Scanner sc =  new Scanner (System.in);
		
		System.out.println("write a number");
		int	num1= sc.nextInt();
		
		int sum=0, lastdigit ;
		
		while (num1!=0) {
			lastdigit = num1%10;
			sum = sum+ lastdigit;
			num1 = num1/10;
						
		} System.out.println(sum);
		
		
		
	}

}
