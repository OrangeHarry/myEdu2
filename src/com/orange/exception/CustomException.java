package com.orange.exception;

public class CustomException extends Exception{//사용자 정의 Exception을 만들려면 Exception을 상속 받는다.

	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomException(String message) {
		super(message);
		System.out.println("CustomException(String message) OK");
	}
}
