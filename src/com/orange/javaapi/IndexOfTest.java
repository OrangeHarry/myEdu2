package com.orange.javaapi;

public class IndexOfTest {
	public static void main(String[] args) {
		String word = "Korea fighting";

		int indicator = word.indexOf("fighting");
		System.out.println(indicator);

		if (word.indexOf("Korea") != -1) {// index�� 0���� �����ϹǷ� -1�� ���� ������ �����Ѵ�.
			System.out.println("\"korea\"�� ���Ե� �����Դϴ�. ");
		} else {
			System.out.println("\"korea\"�� ���Ե� ������ �ƴմϴ�. ");
		}
	}
}
