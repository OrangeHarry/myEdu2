package com.orange.nestedinterface;

public class AnonymousNestedInterfaceTest {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.fieldRemoConEx.setOn(); //�ʵ� ����
		anonymous.fieldRemoConEx.setOff();
		
		anonymous.method01(); //���ú��� ����
		
		anonymous.method02(new RemoConEx() {
			@Override
			public void setOn() {
				System.out.println("AirCon is Set On");
			}
			@Override
			public void setOff() {
				System.out.println("AirCon is Set Off");
			}
		});
	}
}
