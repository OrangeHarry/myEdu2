package com.orange.inheritance;

public class Tiger extends Animal{
	String name = "��ȣ";

	void attack() {
		System.out.println("[child] Tiger is attack");
	}
	void slowWalk() {
		System.out.println("-------Tiger slow walk start-------");
		walk(); // �θ��� �޼ҵ带 ������ �� �� �ִ�.
		System.out.println("-------Tiger slow walk end-------");
	}
}
