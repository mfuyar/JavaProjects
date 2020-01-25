package com.sprintqa.java.class9;

public class PatterProgramPrintSquare {

	public static void main(String[] args) {

		
		for (int i = 1; i <= 5; i++) { // Start of outer for loop, rows

			for (int j = 1; j <= i; j++) { // Start of inner for loop, columns

				//System.out.println();
				System.out.print(j);

			} // End of inner for loop

			System.out.println(); // Just print enter
		} // End of outer for loop
	}

}
