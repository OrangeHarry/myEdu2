package com.orange.condition;

public class IfElseIfElseTest {
	public static void main(String[] args) {
		int jungSuAge = 6;

		if (jungSuAge > 5) {
			System.out.println("jungSuAge > 5");
		} else if (jungSuAge == 4) {
			System.out.println("jungSuAge is 4");
		} else {//���� �� ������ ������ ��� ��츦 ó���մϴ�.
			System.out.println("jungSuAge <= 5");
		}
	}
}
