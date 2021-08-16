package com.orange.access;

public class AccessKeyword {
	// �ʵ�
	public int sample01;
	int sample02; // default
	private int sample03;

	// Constructor
	public AccessKeyword() {
		super();
		// TODO Auto-generated constructor stub
		sample01 = 1;
		sample02 = 2;
		sample03 = 3;
	}

	// �޼ҵ�
	public void run01() {
		System.out.println("run01 start (public)");
	}

	void run02() {// default
		System.out.println("run02 start (default)");
	}

	private void run03() {
		System.out.println("run03 start (private)");
	}
}

//---------------------------------------------------------
//public (����): ��� ���� �����մϴ�.
//protected (��ȣ): �ڽ� Ŭ������ ���� (��ӿ��� ���)
//default (�⺻): ���� ��Ű�������� ���� ����
//private (������): �ڱ� �ڽŸ� ���� ����
//----------------------------------------------------------