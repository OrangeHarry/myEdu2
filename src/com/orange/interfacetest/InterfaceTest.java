package com.orange.interfacetest;

public class InterfaceTest {
	public static void main(String[] args) {
		Remocon remocon = new Radio(); // 인터페이스를 선언하고 객체를 생성해서 넣는다.

		remocon.setOn(); // 재정의된 메소드의 호출
		remocon.setInfoMenu();
		System.out.println(remocon.PRODUCT_ID);// 필드 확인
		Remocon.alertError(); // static 메소드의 호출
		remocon.setOff();

		System.out.println("================================");
		Remocon remocon2 = new TV();
		remocon2.setOn();
		remocon2.setOff();
		remocon2.setInfoMenu();
		Remocon.alertError();
	}
}
