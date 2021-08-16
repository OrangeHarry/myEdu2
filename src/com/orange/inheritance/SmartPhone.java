package com.orange.inheritance;

public abstract class SmartPhone {
	public String name;

	public SmartPhone(String name) {
		super();
		this.name = name;
	}
	
	public void powerOn() {
		System.out.println("SmartPhone Power On");
	}
	public void PowerOff() {
		System.out.println("SmartPhone Power Off");
	}
	public abstract void bootingLogo();
	//이 기능은 무조건 넣어야한다고 하면
	//추상메소드는 껍데기만 선언합니다. 각자가 알아서 Logo를 만들라는 거죠
}
//abstract를 붙이면 new 연산자로 생성해서 사용할 수 없다. 무조건 상속으로 해야한다.