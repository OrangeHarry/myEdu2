package com.orange.operator;

public class DenyOperatorTest {
	public static void main(String[] args) {
		boolean isOnTV = false;

		System.out.println("isOnTV value is " + isOnTV);
		isOnTV = !isOnTV;
		System.out.println("isOnTV value is " + isOnTV);
		if (!isOnTV) {//�̰� ��ü�� ���ؼ� �ݴ��ΰŴϱ� ���⼭�� Ʈ�簪�� else���� �����°� �´�
			System.out.println("TV is Off"); 
		} else {
			System.out.println("TV is On");
		}
	}
}
