package com.orange.operator;

public class StringAddOperatorTest {
	public static void main(String[] args) {
		System.out.println("[우리나라는 대한민국이다]");
		String openSign = "[";
		String closeSign = "]";
		String contentsText = "우리나라는 대한민국이다";

		System.out.println(openSign + contentsText + closeSign);

	}
}
//--------------------------------------------------------
//== : 두 피연산자수가 같은지 검사
//!= : 두 피연산자수가 같지 않은지 검사
//> : 피연자수1이 더 큰지 검사
//< : 피연자수1이 더 작은지 검사
//>=: 피연자수1이 크거나 같은지 검사
//<=: 피연자수1이 작거나 같은지 검사
//---------------------------------------------------------