package com.orange.exception;

public class CustomException extends Exception{//����� ���� Exception�� ������� Exception�� ��� �޴´�.

	public CustomException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomException(String message) {
		super(message);
		System.out.println("CustomException(String message) OK");
	}
}
