package com.sprintqa.hava.class10;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("write a number");
		int num1 = sc.nextInt();

		int sum=0;
		
		for (int i = 1; i < num1; i++) {
			
			if (num1 % i == 0) {
				sum = sum +i;
				//System.out.println(sum);
			}
		}
			if (sum==num1) {
				System.out.println("Perfect Number");
			}	else {
				System.out.println("not perfect");
			}
			}
}

