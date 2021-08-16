package com.orange.exception;

public class TryCatchTest {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.StringTwo"); //이런 이름이 있는지 검사한다.
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //예외 상세를 콘솔 화면에 표기해준다.
			System.out.println("Class not exsist");
		}
	}
}
