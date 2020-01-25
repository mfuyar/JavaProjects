package com.sprinqa.java.class4;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		int choice;
		
		System.out.println("Enter Number 1-7");
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
			
		
		switch (choice) {
		case 1:
			System.out.println("Monday");
		case 2:
			System.out.println("Tuesday");
		case 3:
			System.out.println("Wednesday");
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
		break;
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Sunday");
		
		default:
			System.out.println("1-7 please");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
