package com.orange.javaapi;

public class TrimTest {
	public static void main(String[] args) {
		String str1 = "  		Tell me Something!     ";
		String str2 = "Now";

		System.out.println(str1 + str2);
		System.out.println(str1.trim() + str2);
	}
}
