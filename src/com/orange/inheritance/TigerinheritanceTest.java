package com.orange.inheritance;

public class TigerinheritanceTest {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.color = "White"; // 부모로 접근하여서 변경하였다.
		tiger.name = "호랑이";
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
