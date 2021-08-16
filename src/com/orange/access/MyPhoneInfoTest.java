package com.orange.access;

public class MyPhoneInfoTest {
	public static void main(String[] args) {
		MyPhoneInfo myPhoneInfo = new MyPhoneInfo();
//		myPhoneInfo.phoneNum = "못바꿔";
//		myPhoneInfo.pw = "못바꿔";
		myPhoneInfo.nickName = "애플";
		System.out.println("myPhoneInfo.nickName is " + myPhoneInfo.nickName);

		myPhoneInfo.callPhone();
//		myPhoneInfo.pwModify();//이것도 못바꾸징~
	}
}
