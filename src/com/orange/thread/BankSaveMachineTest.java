package com.orange.thread;

public class BankSaveMachineTest {
	public static void main(String[] args) {
		BankSaveMachine atm = new BankSaveMachine();
		
		BankCustom1 custom1 = new BankCustom1();
		custom1.setBankSaveMachine(atm);//������ü ����
		custom1.start();
		
		BankCustom2 custom2 = new BankCustom2();
		custom2.setBankSaveMachine(atm);//������ü ����
		custom2.start();
	}
}
