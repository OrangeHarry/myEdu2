package com.orange.thread;

public class ExtendsThreadTest {
	public static void main(String[] args) {
		Thread thread = new FirstTaskEx();
		thread.start(); // �긦 ����� ������ ��

		Thread thread2 = new ThirdTaskEx();
		thread2.start();

		for (int i = 0; i < 10; i++) {   
			System.out.println("Second Task Ex");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//���� �����忡 3���� �����尡 ��Ƽ�� ���ư��µ� ����ȭ �޼ҵ� (synchronized)�� �ƴ϶� ������ ���׹�����
}
