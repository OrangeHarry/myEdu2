package com.orange.refertype;

public class ArrayDynamicTest {
	public static void main(String[] args) {
		// ����� ������ �����ϰ�, �ش� ���� ���� �� �ֽ��ϴ�.
//		String[] names = null;
//		names = new String[5];
		
		//���� ���ٷ�, �ǹ����� �̷��� ���� ���δ�.
		String[] names = new String[5];

		names[0] = "�μ�";
		names[1] = "���";
		names[2] = "����";
		names[3] = "�浿";
		names[4] = "����";

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}
	}
}
