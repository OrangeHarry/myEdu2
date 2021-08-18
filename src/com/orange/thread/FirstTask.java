package com.orange.thread;

public class FirstTask implements Runnable{ //재정의 메소드 자동 생성(인터페이스)
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
