package com.sprintqa.hava.class10;

public class pattern3hw {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // Start of outer for loop, rows

			for (int k = 1; k <= 8 - i; k++) {

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) { // Start of inner for loop, columns

				// System.out.print(i);

				System.out.print(j);
			}
			for (int j = 1; j <= i - 1; j++) {

				System.out.print(j);
			}
			for (int j = 1; j <= i - 5; j++) {
				System.out.print(i);

			} 	// End of inner for loop

			System.out.println(); // Just print enter
		} // End of outer for loop

	}
}

