package com.orange.exception;

public class TryCatchTest {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.StringTwo"); //�̷� �̸��� �ִ��� �˻��Ѵ�.
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //���� �󼼸� �ܼ� ȭ�鿡 ǥ�����ش�.
			System.out.println("Class not exsist");
		}
	}
}
