package com.orange.condition;

public class IfScoreTest {
	public static void main(String[] args) {
		int score = 50;
		char grade = ' ';

		if (score > 89) {
			grade = 'A';
		} else if (score > 79) {
			grade = 'B';
		} else if (score > 69) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("Your grade is [" + grade + "]");
	}
}
