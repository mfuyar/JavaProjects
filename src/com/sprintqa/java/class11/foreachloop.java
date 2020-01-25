package com.sprintqa.java.class11;

public class foreachloop {
	public static void main(String[] args) {

		int sum = 0, sumsalary = 0;
		int salary[] = { 2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900 };

		
		for (int empsalary : salary) {
			// System.out.println(empsalary);
			sumsalary = sumsalary + empsalary;

		}
		System.out.println(sumsalary);

	}

}
