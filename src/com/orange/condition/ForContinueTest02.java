package com.orange.condition;

public class ForContinueTest02 {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				continue;
			}
			if (i != 0) {// 0�� ¦���� �ƴϴٶ�°� ǥ��
				System.out.println(i);//¦���� ���~~!!
			}
		}
	}
}
