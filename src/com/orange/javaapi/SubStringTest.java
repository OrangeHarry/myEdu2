package com.orange.javaapi;

public class SubStringTest {
	public static void main(String[] args) {
		String string = "01022224444";
		
		String lastNum4 = string.substring(7, 11);
				//�߶� ���ڿ��� ���� index, ���� index�� �־� �ݴϴ�.
		System.out.println(lastNum4);
		
		String infrontNum3 = string.substring(0, 3);
		                             //last index�� ���ϰ� �ƴ϶� �̸��̴�!!
		System.out.println(infrontNum3);
		
		String theOtherNum = string.substring(3);
		                         //index3 ���ķ� ��� �ڸ���
		System.out.println(theOtherNum);
	}
}
