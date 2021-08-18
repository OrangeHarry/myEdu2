package com.orange.thread;

public class impleThreadTest3 {
	public static void main(String[] args) {
		Runnable runnable = new FirstTask();
		Thread thread = new Thread(runnable);
		thread.start();


		for (int i = 0; i < 10; i++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//�� ��ġ�� ������, ���� ���� �����忡�� Second Task�� ��� ����ǰ�.
		//Third Task�� ����ȴ�.
		//���ο� �ִ°Ŵ� �帧��� ����ȴٴ� ����ΰ�.
		//������First�� Second�� ���� ��Ģ�������� �ʴ�.
		Runnable runnable2 = new ThirdTask();
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}
}
