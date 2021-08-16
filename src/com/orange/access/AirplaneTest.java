package com.orange.access;

public class AirplaneTest {
	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		airplane.setStop(true);
		airplane.setFlySpeed(52540);

		System.out.println("airplane.isStop value is " + airplane.isStop());
		System.out.println("airplane.getflySpeed value is " + airplane.getFlySpeed());
	}
}
