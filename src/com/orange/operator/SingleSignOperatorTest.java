package com.orange.operator;

public class SingleSignOperatorTest {
	public static void main(String[] args) {
		int x = -1;
		int result = +x;
		int result2 = -x;

		System.out.println("x value is " + result);
		System.out.println("-x value is " + result2);

		int y = 1;
		int result3 = +y;
		int result4 = -y;
		System.out.println("y value is " + result3);
		System.out.println("-y value is " + result4);
	}

}
