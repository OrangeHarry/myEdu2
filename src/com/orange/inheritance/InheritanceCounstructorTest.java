package com.orange.inheritance;

public class InheritanceCounstructorTest {
	public static void main(String[] args) {
		Boy boy = new Boy("���");
		System.out.println("======================");

		Boy boy2 = new Boy("����", 29);
		System.out.println(boy.name);
		System.out.println(boy.idNum);
		System.out.println(boy2.name);
		System.out.println(boy2.idNum);
	}
}
