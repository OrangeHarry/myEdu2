package com.orange.javaapi;

public class StringLengthTest {
	public static void main(String[] args) {
//		String phonNum = "01072542222";
//		String phonNum = "07072542222";
		String phonNum = "0432542222";
//		String phonNum = "000000000";

		if (phonNum.length() == 11 && phonNum.indexOf("010") == 0) {
			System.out.println("�޴��� ��ȣ�Դϴ�.");
		} else if (phonNum.length() == 11 && phonNum.indexOf("070") == 0) {
			System.out.println("���ͳ���ȭ�Դϴ�.");
		} else if (phonNum.length() < 11 && phonNum.indexOf("043") == 0) {
			System.out.println("û������ ����ȭ�Դϴ�.");
		} else {
			System.out.println("�� ��ȭ�� �̰�??");
		}
		System.out.println("��ȣ ���� = " + phonNum.length());
		System.out.println("��ȣ=" + phonNum);
	}
}
//