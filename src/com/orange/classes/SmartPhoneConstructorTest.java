package com.orange.classes;

public class SmartPhoneConstructorTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone();
		SmartPhone smartPhone = new SmartPhone("yourPhone");// ���� ��ȣ���� �̸��� �־��ټ��� �ֳ�
		// ������ ���ÿ� �����ڿ� ���� �����Ͽ� phoneName�� �����մϴ�.

		System.out.println("smartPhone.phoneName value is " + smartPhone.phoneName);
		 // ����� phoneName���� �����Ͽ� �� ���� ��� �Ǵ��� Ȯ�� �մϴ�.
	}
}
