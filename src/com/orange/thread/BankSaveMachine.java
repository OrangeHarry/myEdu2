package com.orange.thread;

public class BankSaveMachine {
	private int money;

	public int getMoney() {
		return money;
	}

	public synchronized void setMoney(int money) { 
		this.money = money;

		try {
			Thread.sleep(3 * 1000); // ������ �ٺ��� 3�ʰ��� ó���ð��� �ʿ��ϴ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("BankSaveMachine money value is [" + this.money + "]");
	}
}
//synchronized ��Ƽ ������� ����ȭ�� ���� ���� �߿��� �����̾�

