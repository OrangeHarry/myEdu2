package com.orange.thread;

public class BankCustom1 extends Thread{
	//Ŭ����Ÿ���� �ʵ� �����ΰ�.
	private BankSaveMachine bankSaveMachine; 
	
	//setter��
	public void setBankSaveMachine(BankSaveMachine bankSaveMachine) {
		this.bankSaveMachine = bankSaveMachine;
	}
	
	@Override
	public void run() {
		bankSaveMachine.setMoney(600);//�� �ݾ��� 600��
	}
}
