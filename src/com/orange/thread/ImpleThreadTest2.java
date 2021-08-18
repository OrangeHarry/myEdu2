package com.orange.thread;

public class ImpleThreadTest2 {
	public static void main(String[] args) {
		Runnable runnable = new FirstTask();
		Thread thread = new Thread(runnable);
		thread.start();

		Runnable runnable2 = new ThirdTask();
		Thread thread2 = new Thread(runnable2);
		thread2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
