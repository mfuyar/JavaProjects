package com.sprintqa.hava.class10;

import java.util.Scanner;

public class patternlogicalprime3h {

	public static void main(String[] args) {
	
		// number is prime or not
		//Scanner myObj = new Scanner(System.in);
		// int age = myObj.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		long num = sc.nextInt();
				
		
			for (int j = 2;j <= 9; j++)
				
			

				if (num==1 || num==-1) {
					System.out.println(num+" is not a prime number");
					break;
				}else if (num!=2 && (num%j==0 || num%(j+1)==0)) {
					System.out.println(num+" is not a prime number.");
					break;
				} else{
					System.out.println(num+" is a p11rime number.");
					break;
				} 
					
				}
}
	

				
			
			


