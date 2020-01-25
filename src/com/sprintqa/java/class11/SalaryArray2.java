package com.sprintqa.java.class11;

import java.util.Scanner;

public class SalaryArray2 {
	public static void main(String[] args) {
		
		int sum=0;
		int salary[]= {2000, 5000,1000,500,400,700,600,600,1200,900};
		
		for (int i =0; i<salary.length; i++) {
			//System.out.println(salary[i]);
		sum = sum+salary[i];
	
		}
		System.out.println(sum/salary.length);
		
		
		
		
		/*int studentMarks[]; // Declaration of array
		int choice;

		studentMarks = new int[10]; // initialization of array
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter a number at position " + i + " -");
			studentMarks[i] = sc.nextInt();
		}

		do {

			System.out.println("Enter roll number - ");
			int rollNumber = sc.nextInt();

			System.out.println(studentMarks[rollNumber - 1]);

			System.out.println("do you want to continue ");
			choice = sc.nextInt();
		} while (choice == 1);*/

	}
}
