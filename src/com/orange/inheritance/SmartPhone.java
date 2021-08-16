package com.orange.inheritance;

public abstract class SmartPhone {
	public String name;

	public SmartPhone(String name) {
		super();
		this.name = name;
	}
	
	public void powerOn() {
		System.out.println("SmartPhone Power On");
	}
	public void PowerOff() {
		System.out.println("SmartPhone Power Off");
	}
	public abstract void bootingLogo();
	//�� ����� ������ �־���Ѵٰ� �ϸ�
	//�߻�޼ҵ�� �����⸸ �����մϴ�. ���ڰ� �˾Ƽ� Logo�� ������ ����
}
//abstract�� ���̸� new �����ڷ� �����ؼ� ����� �� ����. ������ ������� �ؾ��Ѵ�.