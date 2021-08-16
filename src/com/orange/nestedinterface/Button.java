package com.orange.nestedinterface;

public class Button {

	OnClickListener clickListener; // �Ʒ����� �������̽��� �ʵ忡 ����!!

	public void setClickListener(OnClickListener clickListener) { // setter �޼ҵ� �߰�
		System.out.println("setClickListener is OK");
		this.clickListener = clickListener;
	}
	
	void onTouch() {
		clickListener.onClick();//interface�� imple�� ����Ǿ� �����Ƿ� ȣ�� ����
	}
	
	interface OnClickListener {
		void onClick();
	}
}
