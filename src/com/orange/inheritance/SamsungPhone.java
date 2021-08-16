package com.orange.inheritance;

public class SamsungPhone extends SmartPhone {
	public String name;

	public SamsungPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void quickPowerOn() {
		System.out.println("SamsungPhone can quick Power On");
	}

	public void bootingLogo() {
		// TODO Auto-generated method stub
		System.out.println("삼성 부팅로고는 요거당");
	}
}
