package com.orange.inheritance;

public class Tiger extends Animal{
	String name = "백호";

	void attack() {
		System.out.println("[child] Tiger is attack");
	}
	void slowWalk() {
		System.out.println("-------Tiger slow walk start-------");
		walk(); // 부모의 메소드를 가져다 쓸 수 있다.
		System.out.println("-------Tiger slow walk end-------");
	}
}
