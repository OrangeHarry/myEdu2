package com.orange.classes;

public class SmartPhone {
	String phoneName = "none";

//	public SmartPhone() { �Ű������� ����()�� ������ڳ�
//		super();
//		// TODO Auto-generated constructor stub
//	phoneName = "myPhone";
//	System.out.println("Counstructor is Call..."+phoneName);

//	public SmartPhone(String name) {// �Ű������� String���� �����ɴϴ�.
//		super();
//		phoneName = name;// �� String���� �ʵ忡 �ֽ��ϴ�.
//		// TODO Auto-generated constructor stub
//		System.out.println("Constructor is Call..." + "phoneName is " + phoneName);
//	}

	public SmartPhone(String phoneName) {// �̸��� phoneName ���� ������, �ʵ���� �ƴ϶� �޾ƿ��� ���Դϴ�.
		super(); // ���� class ��Ī
		this.phoneName = phoneName;// �޾ƿ� ���� �ʵ��� ���� �����ϱ� ���Ͽ� this�� �־��־����ϴ�.
		// �Ʒ����� ���� �Է��մϴ�.
		System.out.println("SmartPhone Auto Constructor is call " + "phoneName value is " + phoneName); // ����մϴ�.
	}
}
