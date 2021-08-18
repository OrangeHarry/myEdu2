package com.orange.thread;

public class ExtendsThreadTest {
	public static void main(String[] args) {
		Thread thread = new FirstTaskEx();
		thread.start(); // 얘를 해줘야 시작이 돼

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
	//메인 스레드에 3개의 스레드가 멀티로 돌아가는데 동기화 메소드 (synchronized)가 아니라서 순서가 뒤죽박죽임
}
