package com.orange.inheritance;

public class OverrideTest {
	public static void main(String[]args) {
		Apart apart= new Apart();
		apart.musicPlay();
		apart.rest(); // �ڽ�Ŭ�������� ������ �� �޼ҵ� ȣ��
		apart.sleep();
		
		System.out.println("========================");
		
		OfficeTel officeTel = new OfficeTel();
		officeTel.work();
		officeTel.eat();
		
		System.out.println("========================");
		
		CountryHouse countryHouse = new CountryHouse();
		countryHouse.playBaseball();
		countryHouse.rest();
		countryHouse.sleep();
	}
}
