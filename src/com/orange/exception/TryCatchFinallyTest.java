package com.orange.exception;

import java.lang.NumberFormatException;

public class TryCatchFinallyTest {
	public static void main(String[] args) {
		try {
			String temp = "10";
//			String temp2 = "10ABC";
			String temp2 = "1000";

			int result = Integer.parseInt(temp);
			int result2 = Integer.parseInt(temp2);

			System.out.println("result value is " + result);
			System.out.println("result2 value is " + result2);

		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("-----NumberFormatException------");
		} finally {
			System.out.println("---------finally----------");
		}
	}
}
