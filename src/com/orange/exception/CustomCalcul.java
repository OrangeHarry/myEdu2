package com.orange.exception;

public class CustomCalcul {

	public void compareXY(int x, int y) throws CustomException { // 예외 떠넘기기
		if (x + y > 10) {
			throw new CustomException("x+y > 10"); // 예외를 새롭게 발생시킨다.
		} else {
			System.out.println("-----Nothing-----");
		}
	}
}
