package com.orange.javaapi;

public class StringValueOfTest {
	public static void main(String[] args) {
		String str1 = String.valueOf(100);
		String str2 = String.valueOf(100.123);
		String str3 = String.valueOf(true);

		System.out.println(str1 + str2 + str3);
	}
}
