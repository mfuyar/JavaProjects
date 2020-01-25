package com.sprintqa.hava.class10;

import java.util.Scanner;

public class patternlogicalprimehoca {

	public static void main(String[] args) {

		// number is prime or not
		// Scanner myObj = new Scanner(System.in);
		// int age = myObj.nextInt();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		long num = sc.nextInt();

		boolean flag = false;

		for (int j = 2; j <= num - 1; j++) {
			if (num % j == 0) {
				System.out.println(num + " is not a prime number");
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("Number is prime");

		}

	}

}
