package com.sprintqa.hava.class10;

import java.util.Scanner;

public class divisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("write a number");
		int num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {

			if (num1 % i == 0) {

				System.out.println(i+" is divider for "+num1);
			}

		}

	}
}