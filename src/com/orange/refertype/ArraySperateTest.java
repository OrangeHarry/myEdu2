package com.orange.refertype;

public class ArraySperateTest {
	public static void main(String[] args) {
		// �迭�� ����� ������ �и��մϴ�.

		// �Ʒ��� ���� �и��ϸ� ������ ��������
//		String[] names;
//		names = {"ö��", "����", "�浿"};

		String[] names;
		names = new String[] { "ö��", "����", "�浿" };

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(+i + names[i]);
		}
	}
}