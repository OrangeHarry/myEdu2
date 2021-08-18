package com.orange.thread;

public class BankSaveMachine {
	private int money;

	public int getMoney() {
		return money;
	}

	public synchronized void setMoney(int money) { 
		this.money = money;

		try {
			Thread.sleep(3 * 1000); // 은행이 바빠서 3초간의 처리시간이 필요하다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("BankSaveMachine money value is [" + this.money + "]");
	}
}
//synchronized 멀티 스레드시 동기화를 막는 아주 중요한 역할이야

