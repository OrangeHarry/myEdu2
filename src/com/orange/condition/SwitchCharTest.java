package com.orange.condition;

public class SwitchCharTest {
	public static void main(String[] args) {
		char alphabet = 'C';

		switch (alphabet) {
		case 'A':
			System.out.println("alphabet is A");
			break;
		case 'B':
			System.out.println("alphabet is B");
			break;
		case 'C':
			System.out.println("alphabet is C");
			break;
		default:
			System.out.println("alphabet is D~Z");
		}
	}
}
