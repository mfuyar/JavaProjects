package com.sprintqa.java.class7;

public class evennumberaddition {

	public static void main(String[] args) {

		
		// 2+4+6+8+10
		
		int sum =0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2==0) {
			//System.out.println(i);
			sum = sum+i;
			
		}
	}
		System.out.println(sum);
		
	
		
	}
}
