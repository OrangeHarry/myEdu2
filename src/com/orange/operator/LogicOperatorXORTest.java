package com.orange.operator;

public class LogicOperatorXORTest {
	public static void main(String[] args) {
		boolean isOnPc = false;
		boolean isOnPhone = true;

		if (isOnPc ^ isOnPhone) {// 피연산자 두개중 하나는 true,하나는 false가 되어야 true를 반환합니다.
			System.out.println("XOR(^) is true..isOnPc isOnPhone");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		} else {
			System.out.println("XOR(^) the others case...");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		}
	}
}
//둘중 하나만 true일때!!