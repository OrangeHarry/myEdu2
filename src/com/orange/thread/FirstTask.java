package com.orange.thread;

public class FirstTask implements Runnable{ //������ �޼ҵ� �ڵ� ����(�������̽�)
	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println("First Task");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
