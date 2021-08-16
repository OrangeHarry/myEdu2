package com.orange.classes;

public class MyInfoTest {
	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo();
//		myInfo.name = "임꺽정";// myInfo클래스 필드에 접근하여 데이타를 바꾸었다.
		System.out.println("myInfo.name is " + myInfo.name);
		System.out.println("myInfo.age is " + myInfo.age);
		System.out.println("myInfo.phoneNum is " + myInfo.phoneNum);
	}
}
