package com.orange.condition;

public class IfTest {
	public static void main(String[] args) {
		int mathScore = 90;

		if (mathScore > 50) {
			System.out.println("mathScore > 50");
		}
		if (mathScore == 51) {
			System.out.println("mathScore is 51");
		}
		if (mathScore > 80) {
			System.out.println("mathScore > 80");
		}
		System.out.println("main method is end");// 위의 if 절과 전혀 상관이 없다.
	}
}
