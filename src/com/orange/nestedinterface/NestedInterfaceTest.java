package com.orange.nestedinterface;

public class NestedInterfaceTest {
	public static void main(String[] args) {
		Button button = new Button();
		button.setClickListener(new MessageListener());//�� �������~
		//setter�� Ŭ���� ���� �������̽��� �󼼱��� ��ü�� �������ش�.
		
		button.onTouch(); //Button���� �޼ҵ带 ����� �װɷ� ȣ������
		
		button.setClickListener(new PushListener());//���� �߰��� Ŭ���� �󼼱���
		button.onTouch();
	}
}
