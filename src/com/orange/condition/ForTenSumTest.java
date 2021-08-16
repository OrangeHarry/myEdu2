package com.orange.condition;

public class ForTenSumTest {
	public static void main(String[] args) {
		int totalSum = 0;

		for (int i = 0; i < 101; i++) {
			totalSum = totalSum + i;
			System.out.println(i);
		}
		System.out.println(totalSum);
	}
}
