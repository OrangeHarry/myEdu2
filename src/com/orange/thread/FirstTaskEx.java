package com.orange.thread;

public class FirstTaskEx extends Thread{
	@Override
	public void run() { //재정의 합니다.
		for(int i=0; i<10; i++) {
			System.out.println("First Task Ex");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
