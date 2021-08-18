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
		//이 위치에 넣으면, 위의 메인 스레드에서 Second Task가 모두 수행되고.
		//Third Task가 실행된다.
		//메인에 있는거는 흐름대로 실행된다는 얘기인가.
		//ㅋㅋㅋFirst랑 Second도 역시 규칙적이지는 않다.
		Runnable runnable2 = new ThirdTask();
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}
}
