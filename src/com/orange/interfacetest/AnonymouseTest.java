package com.orange.interfacetest;

public class AnonymouseTest {
	public static void main(String[]args) {
		Remocon remocon = new Remocon() { //�������̽� ���� = new �������̽�
			
			@Override
			public void setOn() { // �������̽��� ���ǵ� �߻� �޼ҵ� ������
				// TODO Auto-generated method stub
				System.out.println("------SetOn Anonymouse-----");
			}
			
			@Override
			public void setOff() {//�������̽��� ���ǵ� �߻� �޼ҵ� ������
				// TODO Auto-generated method stub
				System.out.println("------SetOff Anonymouse-----");
			}
		}; // ;�� ������ ����!!!!
		remocon.setOn();
		remocon.setOff();
	}
}
