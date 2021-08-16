package com.orange.refertype;

public class ArrayMultiTest {
	public static void main(String[] args) {
		String[][] custList = { { "Ã¶¼ö", "±è¹Î¼ö", "Á¦°¥°ø¸í" }, { "¿µÈñ", "ÀÌ´ÙÈñ", "µ¶°í¼öÁø", "ÇÑÀÌ»Ý»õ·Ò" } };

		System.out.println(custList.length);
		System.out.println(custList[0].length);
		System.out.println(custList[1].length);

		System.out.println(custList[0][0]);
		System.out.println(custList[0][1]);
		System.out.println(custList[0][2]);

		System.out.println(custList[1][0]);
		System.out.println(custList[1][1]);
		System.out.println(custList[1][2]);
		System.out.println(custList[1][3]);
		System.out.println("======================");
		for (int i = 0; i < custList.length; i++) {
			for (int j = 0; j < custList[i].length; j++) {
				System.out.println(custList[i][j]);
			}
		}
	}
}
