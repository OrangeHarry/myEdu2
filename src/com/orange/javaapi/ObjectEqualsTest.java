package com.orange.javaapi;

public class ObjectEqualsTest {
	public static void main(String[] args) {
		Customer cs1 = new Customer("동일");
		Customer cs2 = new Customer("동일");

		System.out.println(cs1 == cs2);
		System.out.println(cs1.equals(cs2));
		
		System.out.println(cs1.name == cs2.name);
		System.out.println(cs1.name.equals(cs2.name));

	}
}
