package com.orange.condition;

public class ForContinueTest02 {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				continue;
			}
			if (i != 0) {// 0은 짝수가 아니다라는걸 표현
				System.out.println(i);//짝수가 출력~~!!
			}
		}
	}
}
