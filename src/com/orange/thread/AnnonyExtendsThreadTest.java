package com.orange.thread;

public class AnnonyExtendsThreadTest {
	public static void main(String[] args) {
		Thread thread = new Thread() {// run 메소드 호출(재정의)
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Annony First Task");
					try {
						Thread.sleep(1 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();

		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Annony Third Task");
					try {
						Thread.sleep(1 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread2.start();

		for (int j = 0; j < 10; j++) {
			System.out.println("Second Task");
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
