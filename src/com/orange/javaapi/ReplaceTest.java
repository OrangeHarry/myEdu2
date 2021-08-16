package com.orange.javaapi;

public class ReplaceTest {
	public static void main(String[] args) {
		String originStr = "java Study Now";
		String toBeStr = originStr.replace("Now", "Yesterday");

		System.out.println(originStr);
		System.out.println(toBeStr);
	}
}
