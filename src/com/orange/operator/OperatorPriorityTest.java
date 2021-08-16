package com.orange.operator;

public class OperatorPriorityTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;

		int result = x + y * z;// 곱하기를 먼저하지
		System.out.println("result value is " + result);

		int result2 = (x + y) * z;// 괄호를 먼저 계산하지
		System.out.println("result2 value is " + result2);

		int result3 = x + (y * z); // 그냥 맞는 상황도 괄호를 넣자 일할때 찾기 편리하게
		System.out.println("result3 value is " + result3);
	}
}
