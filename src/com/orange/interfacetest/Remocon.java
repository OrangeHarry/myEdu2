package com.orange.interfacetest;

public interface Remocon {
	// ���
	public int UID = 100;
	public int PRODUCT_ID = 1;

	// abstract method(�߻�)
	void setOn(); // abstract ������

	abstract void setOff(); // abstract �������� ����

	// default method(�⺻)
	default void setInfoMenu() {
		System.out.println("show Info Menu");
	}

	// static method(����)
	static void alertError() {// ���� �޼ҵ�
		System.out.println("Error CODE:0001");
	}
}
