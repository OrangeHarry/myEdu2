package com.orange.javaapi;

import java.util.StringTokenizer;

public class StringTokenTwoTest {
	public static void main(String[] args) {
		String str1 = "suji|minsu|sumi|haksun";
		String[] arr = new String[4]; // �迭 ���� �� ����

		StringTokenizer stringTokenizer = new StringTokenizer(str1, "|");
		int cnt = stringTokenizer.countTokens();

		for (int i = 0; i < cnt; i++) {
			String result = stringTokenizer.nextToken();
			System.out.println(result);
			arr[i] = result; // �迭�� �ֱ�
		}
		for (int j = 0; j < arr.length; j++) {//�迭�� ���� �ߵ����� Ȯ��
			System.out.println(arr[j]);
		}
	}
}
