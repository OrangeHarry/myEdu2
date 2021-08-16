package com.orange.condition;

public class ForContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {// 나머지가 없다는 뜻, 짝수
				continue;// 여기서 아래로 이동하지 않고 다시 조건문을 타게됩니다.

			}
			System.out.println(i); // 홀수만 출력된다.
		}
	}
}
