package com.orange.nestedinterface;

public class Button {

	OnClickListener clickListener; // 아래만든 인터페이스를 필드에 선언!!

	public void setClickListener(OnClickListener clickListener) { // setter 메소드 추가
		System.out.println("setClickListener is OK");
		this.clickListener = clickListener;
	}
	
	void onTouch() {
		clickListener.onClick();//interface와 imple이 연결되어 있으므로 호출 가능
	}
	
	interface OnClickListener {
		void onClick();
	}
}
