package com.orange.interfacetest;

public class InterfaceTest {
	public static void main(String[] args) {
		Remocon remocon = new Radio(); // �������̽��� �����ϰ� ��ü�� �����ؼ� �ִ´�.

		remocon.setOn(); // �����ǵ� �޼ҵ��� ȣ��
		remocon.setInfoMenu();
		System.out.println(remocon.PRODUCT_ID);// �ʵ� Ȯ��
		Remocon.alertError(); // static �޼ҵ��� ȣ��
		remocon.setOff();

		System.out.println("================================");
		Remocon remocon2 = new TV();
		remocon2.setOn();
		remocon2.setOff();
		remocon2.setInfoMenu();
		Remocon.alertError();
	}
}
