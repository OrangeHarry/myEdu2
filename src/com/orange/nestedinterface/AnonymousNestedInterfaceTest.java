package com.orange.nestedinterface;

public class AnonymousNestedInterfaceTest {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.fieldRemoConEx.setOn(); //필드 접근
		anonymous.fieldRemoConEx.setOff();
		
		anonymous.method01(); //로컬변수 접근
		
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
