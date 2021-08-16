package com.orange.refertype;

public class ArrayStringTest {
	public static void main(String[] args) {
		String[] names = { "Ã¶¼ö", "¿µÈñ", "±æµ¿" };

		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println("names.length value is " + names.length);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
