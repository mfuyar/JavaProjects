package com.sprintqa.java.class11;

import java.util.Scanner;

public class declaringarray {
	public static void main(String[] args) {
		
		int sumeven=0, sumodd=0;
		int numbers[]= {12, 65,78,1,6,45,71,87,65,34,89};
		
		for (int i=0; i<numbers.length; i++) {
			//System.out.println(numbers[i]);
			if (numbers[i]%2==0) {
				
			//	System.out.println("number of even number "+sumeven);
				sumeven++;
				} else {
		
			//	System.out.println("Odd numbers "+ sumodd);
				sumodd++;
			}
			}
			System.out.println(sumeven);
			System.out.println(sumodd);
	}
	}
		
		//System.out.println(sum);
		
		
		
		
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
		} while (choice == 1);

	}
}*/
