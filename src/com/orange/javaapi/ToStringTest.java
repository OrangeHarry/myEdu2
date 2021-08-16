package com.orange.javaapi;

import java.util.Date;

//toString() == 이름 그대로 문자로 변환해서 보여준다.

public class ToStringTest {
	public static void main(String[] args) {
		Object object = new Date();
//		System.out.println(object+1); 아예 연산이 안된다 
		System.out.println(object.toString()+1); //문자열로 변환이 되서 연산이 되네
		
	}
}
