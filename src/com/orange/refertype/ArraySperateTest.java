package com.orange.refertype;

public class ArraySperateTest {
	public static void main(String[] args) {
		// 배열의 선언과 생성을 분리합니다.

		// 아래와 같이 분리하면 편집기 에러난다
//		String[] names;
//		names = {"철수", "영희", "길동"};

		String[] names;
		names = new String[] { "철수", "영희", "길동" };

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(+i + names[i]);
		}
	}
}