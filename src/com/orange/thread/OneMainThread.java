package com.orange.thread;

public class OneMainThread {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("First Task");
			try {
				Thread.sleep(1000);//�Ͻ����� Ű����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int j=0; j<10; j++) {
			System.out.println("Third Task");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
//�ϳ��� ���ν����忡�� ������� �帧���� �� �������ٰ� ���� �ȴ�.
