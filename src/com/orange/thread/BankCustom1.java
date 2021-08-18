package com.orange.thread;

public class BankCustom1 extends Thread{
	//클래스타입의 필드 선언인가.
	private BankSaveMachine bankSaveMachine; 
	
	//setter값
	public void setBankSaveMachine(BankSaveMachine bankSaveMachine) {
		this.bankSaveMachine = bankSaveMachine;
	}
	
	@Override
	public void run() {
		bankSaveMachine.setMoney(600);//총 금액은 600원
	}
}
