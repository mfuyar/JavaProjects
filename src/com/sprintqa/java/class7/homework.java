package com.sprintqa.java.class7;

public class homework {

	public static void main(String[] args) {

		
		// 1+2-3+4+5-6+7+8-9+10
		
		int sum =0, sub=0 ;
		
		for (int i = 1; i <= 10 ; i++) {
			sum = sum+i;
			
			if (i%3==0) {
			sub =  sub+i;
		}
		
	 }
		System.out.println("Summary of 1-10 is "+ sum);
		System.out.println("Summary of number who can divided by 3 is "+ sub);
		
			System.out.println("Answers is "+(sum-sub)); //sum-sub= answer
			
		
	}
				
		
	} 

	