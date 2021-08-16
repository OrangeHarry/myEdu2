package com.orange.nestedinterface;

public class NestedInterfaceTest {
	public static void main(String[] args) {
		Button button = new Button();
		button.setClickListener(new MessageListener());//자 만들었다~
		//setter로 클래스 하위 인터페이스에 상세구현 객체를 설정해준다.
		
		button.onTouch(); //Button에서 메소드를 만들고 그걸로 호출하자
		
		button.setClickListener(new PushListener());//새로 추가된 클래스 상세구현
		button.onTouch();
	}
}
