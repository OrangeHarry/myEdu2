package com.orange.interfacetest;

public interface Remocon {
	// 상수
	public int UID = 100;
	public int PRODUCT_ID = 1;

	// abstract method(추상)
	void setOn(); // abstract 생략됨

	abstract void setOff(); // abstract 생략하지 않음

	// default method(기본)
	default void setInfoMenu() {
		System.out.println("show Info Menu");
	}

	// static method(정적)
	static void alertError() {// 오류 메소드
		System.out.println("Error CODE:0001");
	}
}
