package com.sprintqa.hava.class10;

public class pattern2 {

	public static void main(String[] args) {
	
		for (int i = 1; i <= 5; i++) { // Start of outer for loop, rows

			for (int k=1; k<=5-i; k++) {
				
				System.out.print(" ");
			}
			System.out.print(i);
				for (int j = 1; j <= i-1; j++) { // Start of inner for loop, columns
				
				//System.out.println();
				System.out.print(i-1);
				}
				for (int j = 1; j <= i-1; j++) { 
				System.out.print(j);
			} 
				// End of inner for loop

			System.out.println(); // Just print enter
		} // End of outer for loop
		
		
		}
	}



