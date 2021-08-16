package com.orange.javaapi;

public class StringLengthTest {
	public static void main(String[] args) {
//		String phonNum = "01072542222";
//		String phonNum = "07072542222";
		String phonNum = "0432542222";
//		String phonNum = "000000000";

		if (phonNum.length() == 11 && phonNum.indexOf("010") == 0) {
			System.out.println("휴대폰 번호입니다.");
		} else if (phonNum.length() == 11 && phonNum.indexOf("070") == 0) {
			System.out.println("인터넷전화입니다.");
		} else if (phonNum.length() < 11 && phonNum.indexOf("043") == 0) {
			System.out.println("청주지역 집전화입니다.");
		} else {
			System.out.println("뭔 전화야 이건??");
		}
		System.out.println("번호 길이 = " + phonNum.length());
		System.out.println("번호=" + phonNum);
	}
}
//