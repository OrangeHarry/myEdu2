package com.orange.nestedinterface;

public class RemoConDetail {
	RemoConExTwo fieldRe = new RemoConExTwo() {
		@Override
		public void powerOff() {
			System.out.println("Poewr Off....Bye");
		}
	};
	
	void devicePowerOff(RemoConExTwo remoConExTwo) {
		remoConExTwo.powerOff();
	}
}
