package com.orange.access;

public class AccessKeyword {
	// 필드
	public int sample01;
	int sample02; // default
	private int sample03;

	// Constructor
	public AccessKeyword() {
		super();
		// TODO Auto-generated constructor stub
		sample01 = 1;
		sample02 = 2;
		sample03 = 3;
	}

	// 메소드
	public void run01() {
		System.out.println("run01 start (public)");
	}

	void run02() {// default
		System.out.println("run02 start (default)");
	}

	private void run03() {
		System.out.println("run03 start (private)");
	}
}

//---------------------------------------------------------
//public (공공): 모두 접근 가능합니다.
//protected (보호): 자식 클래스만 접근 (상속에서 사용)
//default (기본): 같은 패키지에서는 접근 가능
//private (사적인): 자기 자신만 접근 가능
//----------------------------------------------------------