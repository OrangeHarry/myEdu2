package com.orange.access;

public class MyCarGetSetTest {
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.setSpeed(220);// setter 메소드로 접근하여 값변경

		System.out.println("myCar.getSpeed value is [" + myCar.getSpeed() + "]");
//		System.out.println("myCar.setSpeed value is ["+myCar.setSpeed(10);+"]");
	}
}
