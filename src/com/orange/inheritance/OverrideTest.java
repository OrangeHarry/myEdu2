package com.orange.inheritance;

public class OverrideTest {
	public static void main(String[]args) {
		Apart apart= new Apart();
		apart.musicPlay();
		apart.rest(); // 자식클래스에서 재정의 된 메소드 호출
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
