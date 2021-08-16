package com.orange.classes;

public class DogFiledTest {
	public static void main(String[] args) {
		Dog dog = new Dog();// new key로 델리게이션 메모리에 객체 생성. 참조가능
		System.out.println(dog.name);
		System.out.println(dog.gender);
		System.out.println(dog.age);
		System.out.println(dog.color);
		System.out.println(dog.kind);
		System.out.println(dog.character);
	}
}
