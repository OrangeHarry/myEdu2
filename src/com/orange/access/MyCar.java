package com.orange.access;

public class MyCar {
	private int speed; //private로 보호해준다.

	public int getSpeed() {//getter method (외부접근을 위한 method)
		return speed;
	}

	public void setSpeed(int speed) {//setter method(외부 접근을 위한 method)
		this.speed = speed;
	}
}
