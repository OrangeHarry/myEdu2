package com.orange.inheritance;

public class People {
	public String name; // ��� �׳� �Ű�����, �޾ƿ��°�, �������� �ƴϾ�!!

//	public People(String name) {// ���� name�̶� ������ �ƴϰ� �ϳ��� ������ ��ü
//		this.name = name; // �갡 ������
//		System.out.println("[parents] Constructor OK");
//  }	
	
	public People(String name) {
		super();
		this.name = name;
		System.out.println("[parents] Constructor OK");
	}

	
	
}
