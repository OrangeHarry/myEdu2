package com.orange.operator;

public class DenyOperatorTest {
	public static void main(String[] args) {
		boolean isOnTV = false;

		System.out.println("isOnTV value is " + isOnTV);
		isOnTV = !isOnTV;
		System.out.println("isOnTV value is " + isOnTV);
		if (!isOnTV) {//이거 자체에 대해서 반대인거니깐 여기서는 트루값인 else값이 나오는게 맞다
			System.out.println("TV is Off"); 
		} else {
			System.out.println("TV is On");
		}
	}
}
