package com.orange.inheritance;

public class TigerinheritanceTest {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.color = "White"; // �θ�� �����Ͽ��� �����Ͽ���.
		tiger.name = "ȣ����";
		tiger.walk();
		tiger.eat();
		tiger.attack();
		System.out.println("Tiger color is [" + tiger.color + "]");
		System.out.println("Tiger color is [" + tiger.name + "]");
		tiger.slowWalk();

		System.out.println("=======================================");
		
		Mouse mouse = new Mouse();
		mouse.color = "Black";
		mouse.walk();
		mouse.eat();
		System.out.println("Mouse color is[" + mouse.color + "]");
		mouse.runAway();

	}
}
