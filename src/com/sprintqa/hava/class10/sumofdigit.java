package com.sprintqa.hava.class10;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {

Scanner sc =  new Scanner (System.in);
		
		System.out.println("write a number");
		int	num1= sc.nextInt();
		
		int sum=0, lastdigit, backupofnum1=num1;
		
		while (num1!=0) {
			lastdigit = num1%10;
			sum = sum+ lastdigit*lastdigit*lastdigit;
			num1 = num1/10;
			
			
			
		} System.out.println(sum);
		System.out.println(backupofnum1);
		
			if (sum == backupofnum1) {
				System.out.println("number is armstrong");
			}else {
				System.out.println("number is not armstrong");
			}
		
	
		
		
		
		
		
		
	}

}
