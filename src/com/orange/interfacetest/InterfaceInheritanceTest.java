package com.orange.interfacetest;

public class InterfaceInheritanceTest {
	public static void main(String[]args) {
		InputDeviceImpl inputDeviceImpl = new InputDeviceImpl();//�� ������ Ŭ������ ����
		
		PhysicalButton physicalButton = inputDeviceImpl; //�������̽��� �󼼱����� instance�� �ֽ��ϴ�.		
		physicalButton.keyPressed();//�ڽ��� Ŭ������ ���ǵ� �߻� �޼ҵ常 ȣ�� ����
		
		ScreenTouch screenTouch = inputDeviceImpl;
		screenTouch.onTouch();
		
		EarPhoneSocket earPhoneSocket = inputDeviceImpl;
		earPhoneSocket.onSound();
		
		System.out.println("==============================");
		InputDevice inputDevice = inputDeviceImpl; // ���߻���� InputDevice�� �� ������ Ŭ������ �ֽ��ϴ�.
		//�Ʒ� ��ӹ��� �ΰ��� �޼ҵ�� �ڽ��� �߻� �޼ҵ� ��� ȣ�� ����
		inputDevice.keyPressed();
		inputDevice.onTouch();
		inputDevice.alertError();
		inputDevice.onSound();
		System.out.println("==============================");
//		inputDeviceImpl.keyPressed();
//		inputDeviceImpl.onTouch();
//		inputDeviceImpl.alertError();
//		inputDeviceImpl.onSound();
//				
	}
}
