package com.orange.javaapi;

public class SubStringTest {
	public static void main(String[] args) {
		String string = "01022224444";
		
		String lastNum4 = string.substring(7, 11);
				//잘라낼 문자열의 시작 index, 끝날 index를 넣어 줍니다.
		System.out.println(lastNum4);
		
		String infrontNum3 = string.substring(0, 3);
		                             //last index는 이하가 아니라 미만이다!!
		System.out.println(infrontNum3);
		
		String theOtherNum = string.substring(3);
		                         //index3 이후로 모두 자르기
		System.out.println(theOtherNum);
	}
}
