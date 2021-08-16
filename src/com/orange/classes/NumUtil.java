package com.orange.classes;

public class NumUtil {
	static boolean isOddEven(int x) {
		if (x % 2 == 0) {// Â¦¼ö
			return true;
		} else {
			return false;
		}
	}

	static boolean isTwoNumCompare(int x, int y) {
		if (x - y > -1) {
			return true;
		} else {
			return false;
		}
	}
}
