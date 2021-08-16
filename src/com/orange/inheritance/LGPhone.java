package com.orange.inheritance;

public class LGPhone extends SmartPhone {

	public LGPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void quickPowerOff() {
		System.out.println("LGPhone can quick Power Off");
	}

	public void bootingLogo() {
		System.out.println("LG폰의 부팅로고는 이거다");
	}
}
