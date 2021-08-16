package com.orange.zero;//패키지(꾸러미)의 경로

public class FirstMainAnalysis1 {// 클래스의 시작
	public static void main(String[] args) {// 메인 메소드의 시작
		System.out.println("FirstMainAnalysis is Start");// 시스템에서 출력, 새로운 줄로 프린트하라. ln(Line New)문자의 끝은';'로 닫아준다.

//		System.out.println(args[0].toString()); // 받아온 인자의 배열 첫번째 값을 출력.

		for (int i = 0; i < args.length; i++) {//복수개의 인자확인
			System.out.println(args[i].toString());
		}
	}// 메인 메소드의 끝
}
//public static void main (String[] args) { 
//이 메소드는 메모리에 상주하면 공용으로 접근 가능하며 메소드의 형태가 void 형으로 아무런 리턴 값을 가지지 않는다.[그냥 메소드 블럭에 있는 내용들만 실행 된다.]
//String[] : 문자 배열들.
//args: arguments (인수)의 약자 입니다.