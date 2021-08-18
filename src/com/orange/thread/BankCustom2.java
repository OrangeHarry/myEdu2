package com.orange.thread;

public class BankCustom2 extends Thread{
	private BankSaveMachine bankSaveMachine;

	public void setBankSaveMachine(BankSaveMachine bankSaveMachine) {
		this.bankSaveMachine = bankSaveMachine;
	}
	
	@Override
	public void run() {
		bankSaveMachine.setMoney(400);
	}
}
