package com.orange.inheritance;

public class OfficeTel extends House {
	public String name;

	void work() {
		System.out.println("working....:(");
	}

	void eat() {
		super.rest();
		System.out.println("eating");// �θ� method�� ȣ���մϴ�.
	}
}
