package com.orange.classes;

public class SmartPhone {
	String phoneName = "none";

//	public SmartPhone() { 매개변수가 없다()가 비어있자낭
//		super();
//		// TODO Auto-generated constructor stub
//	phoneName = "myPhone";
//	System.out.println("Counstructor is Call..."+phoneName);

//	public SmartPhone(String name) {// 매개변수로 String형을 가져옵니다.
//		super();
//		phoneName = name;// 이 String형을 필드에 넣습니다.
//		// TODO Auto-generated constructor stub
//		System.out.println("Constructor is Call..." + "phoneName is " + phoneName);
//	}

	public SmartPhone(String phoneName) {// 이름이 phoneName 으로 같지만, 필드명이 아니라 받아오는 값입니다.
		super(); // 상위 class 지칭
		this.phoneName = phoneName;// 받아온 값과 필드의 값을 구별하기 위하여 this를 넣어주었습니다.
		// 아래에는 직접 입력합니다.
		System.out.println("SmartPhone Auto Constructor is call " + "phoneName value is " + phoneName); // 출력합니다.
	}
}
