package com.orange.inheritance;

public class AbstractTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone(); //abstract���� ������

		SamsungPhone samsungPhone = new SamsungPhone("������ S22");
		samsungPhone.powerOn();
		samsungPhone.quickPowerOn();
		samsungPhone.PowerOff();
		samsungPhone.bootingLogo();

		System.out.println("===========================");

		LGPhone lgPhone = new LGPhone("������");
		lgPhone.powerOn();
		lgPhone.quickPowerOff();
		lgPhone.PowerOff();
		lgPhone.bootingLogo();
	}
}
