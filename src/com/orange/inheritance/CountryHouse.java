package com.orange.inheritance;

public class CountryHouse extends House {
	private String name;

	void playBaseball() {
		System.out.println("�츮 ���忡���� �߱��� ������");
	}

	void rest() {
		System.out.println("���忡�� ����ġ�带 �����鼭 ���� ��¡");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("���忡���� ���� �� ����~");
//		super.sleep();// �θ�޼ҵ��� ȣ�⵵ ����
	}
}
