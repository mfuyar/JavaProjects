package com.sprintqa.hava.class10;

public class pattern1 {

	public static void main(String[] args) {
	
		for (int i = 1; i <= 5; i++) { // Start of outer for loop, rows

			for (int k=1; k<=5-i; k++) {
				
				System.out.print(" ");
			}
			
				for (int j = 1; j <= i; j++) { // Start of inner for loop, columns
				
				//System.out.println();
				System.out.print("*");

			} // End of inner for loop

			System.out.println(); // Just print enter
		} // End of outer for loop
		
		
		}
	}



