package com.orange.interfacetest;

public class AnonymouseTwoTest {
	public static void main(String[] args) {

		Remocon remocon = new Remocon() {

			@Override
			public void setOn() {
				// TODO Auto-generated method stub
				System.out.println("Exe----SetOn");
			}

			@Override
			public void setOff() {
				// TODO Auto-generated method stub
				System.out.println("Exe----SetOff");
			}
		};
		remocon.setOn();
		remocon.setOff();
	}
}