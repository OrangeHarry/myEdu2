package com.orange.javaapi;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String str1 = "���|����|����|����|�¿�";

		StringTokenizer stringTokenizer = new StringTokenizer(str1, "|");
		int cnt = stringTokenizer.countTokens();

		for (int i = 0; i < cnt; i++) {
			String result = stringTokenizer.nextToken();
			System.out.println(result);
		}

	}
}
