package com.orange.nestedinterface;

public class AnonymousNestedInterface02Test {
	public static void main(String[] args) {
		RemoConDetail remoConDetail = new RemoConDetail();
		remoConDetail.fieldRe.powerOff();
		
		remoConDetail.devicePowerOff(new RemoConExTwo() {
			@Override
			public void powerOff() {
				System.out.println("�Ŀ� ����~~!!");// TODO Auto-generated method stub
			}
		});
	}
}
