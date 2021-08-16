package com.orange.inheritance;

public class CountryHouse extends House {
	private String name;

	void playBaseball() {
		System.out.println("우리 별장에서는 야구도 가능해");
	}

	void rest() {
		System.out.println("별장에선 피톤치드를 마쉬면서 쉴수 있징");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("별장에서는 보다 더 꿀잠~");
//		super.sleep();// 부모메소드의 호출도 가능
	}
}
