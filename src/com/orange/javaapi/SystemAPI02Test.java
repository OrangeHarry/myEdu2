package com.orange.javaapi;

public class SystemAPI02Test {
	public static void main(String[] args) {
		long startTime = 0;
		long endTime = 0;

		for (int i = 0; i < 999999; i++) {
			System.out.println(i);
			if (i == 0) {
				startTime = System.currentTimeMillis();
			} else if (i == 899999) {
				endTime = System.currentTimeMillis();
				System.out.println("�� �ҿ�ð��� = " + (endTime - startTime) / 1000+"��");
				// �и���ũ ������ �ʸ� ���Ϸ��� 1000���� ������� �Ѵ�.
				System.exit(0);
			}
		}
	}
}
