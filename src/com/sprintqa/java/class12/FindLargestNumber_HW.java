package com.sprintqa.java.class12;

public class FindLargestNumber_HW {

	// Write a program to print largest number from array
	
	public static void main(String[] args) {
		int numbers[] = { 10,105, 35, 67, 89, 45, 10, 40 , 60, 58, 7};
		
		// largest number - 89
		
		
		for (int num:numbers) {
			//System.out.println(num);
		}		
			
		minNumber=numbers[0];
			for (int i=0; i<numbers.length;i++)
				if (numbers[i]>numbers[i+1]) {
					System.out.println("largest number is " +numbers[i]+ " at position number "+i);
					break;
				}
			
		
	}

}
