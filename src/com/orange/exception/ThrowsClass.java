package com.orange.exception;

public class ThrowsClass {

//	public void findClass() throws ClassNotFoundException {
//		Class clazz = Class.forName("java.lang.StringTwo");
//		// �̷� �޼ҵ尡 ���� ������ ClassNotFoundException�� �߻��մϴ�.
//		// ���⼭ try catch ���� �ʰ� �� �޼ҵ带 ȣ�� �ϴ� �κп��� Try catch�ϵ��� �� �� ����.
//	}
	
	
	public void findClass() {
		try {
			Class clazz = Class.forName("java.lang.StringTwo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
