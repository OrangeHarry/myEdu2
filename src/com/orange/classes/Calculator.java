package com.orange.classes;

public class Calculator {
	// �޼ҵ�� �Ʒ��� ���� ���·� �����Ѵ�.
	int plus(int x, int y) {// ���ϰ��� ������, �Ű������� 2��
		int result = 0;
		result = x + y;
		return result;
	}

	int minus(int x, int y) {
		int result = 0;
		result = x - y;
		return result;
	}

	String getName() {// ���ϰ��� String
		String result = "MyCalculor";
		return result;
	}

	boolean isBateryEmpty() {// ���ϰ��� boolean
		return false;
	}

	void setFactorylint() {// ���ϰ��� ����
		System.out.println("-----Calculator is Factory lnit------");
	}
}
