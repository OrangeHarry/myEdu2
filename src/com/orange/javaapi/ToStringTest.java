package com.orange.javaapi;

import java.util.Date;

//toString() == �̸� �״�� ���ڷ� ��ȯ�ؼ� �����ش�.

public class ToStringTest {
	public static void main(String[] args) {
		Object object = new Date();
//		System.out.println(object+1); �ƿ� ������ �ȵȴ� 
		System.out.println(object.toString()+1); //���ڿ��� ��ȯ�� �Ǽ� ������ �ǳ�
		
	}
}
