package com.orange.javaapi;

public class IndexOfTest {
	public static void main(String[] args) {
		String word = "Korea fighting";

		int indicator = word.indexOf("fighting");
		System.out.println(indicator);

		if (word.indexOf("Korea") != -1) {// index는 0부터 시작하므로 -1은 값이 없을때 리턴한다.
			System.out.println("\"korea\"가 포함된 문장입니다. ");
		} else {
			System.out.println("\"korea\"가 포함된 문장이 아닙니다. ");
		}
	}
}
