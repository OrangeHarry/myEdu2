package com.orange.classes;

public class Phone {
	
	public Phone() {//자동으로 생성된 생성자
		super();//class의 상위를 나타내는 키워드 입니다.
		// TODO Auto-generated constructor stub //여기에 코드를 넣어준다
		System.out.println("Auto Create Phone Constructor is Call.."); //직접넣어봤지

//		여기에 Phone 생성자 constructor가 생략되어 있습니다.
//		public Phone() { // public 으로 클래스명과 동일하게 작성했습니다. 
//			System.out.println("Phone Constructor is Call...");
	}
}

//생성자는 객체가 new keyword를 사용하여 생성되고 메모리가 올라가는 순간에 호출되어 init(초기화)되는 기능을 합니다.
//클래스 작성시에 따로 만들지 않으면, 생성자는 생략됩니다.
//꼭 만드실 필요가 없는 경우도 있고, 필요에 따라서 만들어서 사용하시면 됩니다.
//해당 필드들이 초기화시에 데이타를 변경하고자 할 때 꼭 필요합니다.