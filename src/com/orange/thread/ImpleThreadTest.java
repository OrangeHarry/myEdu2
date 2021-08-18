package com.orange.thread;

public class ImpleThreadTest {
	public static void main(String[] args) {
		Runnable runna1 = new FirstTask();
		Thread thread = new Thread(runna1);
		thread.start(); // 재정의 된 run 실행
		
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
