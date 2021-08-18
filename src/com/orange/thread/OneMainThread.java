package com.orange.thread;

public class OneMainThread {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("First Task");
			try {
				Thread.sleep(1000);//일시정지 키워드
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
//하나의 메인스레드에서 스래드는 흐름별로 쭉 내려간다고 보면 된다.
