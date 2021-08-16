package com.orange.nestedclasses;

public class NestedClassTwoTest {
	public static void main(String[] args) {
		OutClassExtend outClassExtend = new OutClassExtend();
		outClassExtend.OutClassExtendMethod();
	}
}
//로컬 클래스(메소드 안에 있는 클래스)의 경우 메소드가 호출 될 때만 수행됩니다.
//외부에서 접근을 할 수 없고, 접근자를 사용 할 수 없습니다.
//이 로컬클래스는 외부에서 변경 할 수 없다는 점을 확인 해 두셔야 합니다.