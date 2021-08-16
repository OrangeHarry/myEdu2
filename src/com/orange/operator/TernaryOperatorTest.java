package com.orange.operator;

public class TernaryOperatorTest {
	public static void main(String[] args) {
		int gilDongAge = 10;

		char isAdult = (gilDongAge > 20) ? 'T' : 'F';// 성인여부 확인로직

		System.out.println("gilDong isAdult value is [" + isAdult + "]");
	}
}
