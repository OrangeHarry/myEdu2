package com.orange.classes;

public class MethodTest {
	public static void main(String[] args) {
//		Calculator calculator = new Calculator();
//
//		System.out.println("calculator plus(1,2) value is [" + calculator.plus(1, 2) + "]");
//		System.out.println("calculator minus(4,2) value is [" + calculator.minus(4, 2) + "]");
//		System.out.println("calculator getName value is [" + calculator.getName() + "]");
//		System.out.println("calculator BateryEmpty value is [" + calculator.isBateryEmpty() + "]");
//		calculator.setFactorylint();

		Refrigerator refrigerator = new Refrigerator();
		refrigerator.openDoor();
		refrigerator.closeDoor();
		System.out.println(refrigerator.isDoorOpen());
		refrigerator.frozen();
		System.out.println(refrigerator.modelName());
		System.out.println(refrigerator.temperature());

	}
}
