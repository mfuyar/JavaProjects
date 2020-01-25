package com.sprintqa.java.class7;

public class seriesprogram {

	public static void main(String[] args) {

		// 1/2+2/3+3/4+....10/11.

		/*double sum = 0;

		for (double i = 1; i <= 10; i++) {
			sum = sum + i / (i + 1);

		}

		System.out.println(sum);*/

		// 1 + 10 + 2 + 9 + 3 + 8 + 4 + 7 + 5 + 6

		/*int sum = 0;

		for (int i = 1,j=10; i <= 5;j--, i++) {
			sum = sum+i;
			System.out.println(i);
			System.out.println(j);
		}

		System.out.println("addition of numbers are "+sum);*/

		//1^2+2^2+3^2....10^2
		
		int sum = 0;

		for (int i = 1; i <= 3;i++) {
			
			
		
			sum = sum+(i*i);
			System.out.println("integrent is "+i+"sum is "+sum);
			//System.out.println(j);
		}

		System.out.println("addition of numbers are "+sum);
	}

}
