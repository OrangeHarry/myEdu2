package com.orange.javaapi;

import java.util.StringTokenizer;

public class StringTokenTwoTest {
	public static void main(String[] args) {
		String str1 = "suji|minsu|sumi|haksun";
		String[] arr = new String[4]; // 배열 선언 및 생성

		StringTokenizer stringTokenizer = new StringTokenizer(str1, "|");
		int cnt = stringTokenizer.countTokens();

		for (int i = 0; i < cnt; i++) {
			String result = stringTokenizer.nextToken();
			System.out.println(result);
			arr[i] = result; // 배열값 넣기
		}
		for (int j = 0; j < arr.length; j++) {//배열에 값이 잘들어갔는지 확인
			System.out.println(arr[j]);
		}
	}
}
