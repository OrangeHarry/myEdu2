package com.orange.access;

public class MyPhoneInfoTest {
	public static void main(String[] args) {
		MyPhoneInfo myPhoneInfo = new MyPhoneInfo();
//		myPhoneInfo.phoneNum = "���ٲ�";
//		myPhoneInfo.pw = "���ٲ�";
		myPhoneInfo.nickName = "����";
		System.out.println("myPhoneInfo.nickName is " + myPhoneInfo.nickName);

		myPhoneInfo.callPhone();
//		myPhoneInfo.pwModify();//�̰͵� ���ٲ�¡~
	}
}
