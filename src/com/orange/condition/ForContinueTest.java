package com.orange.condition;

public class ForContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {// �������� ���ٴ� ��, ¦��
				continue;// ���⼭ �Ʒ��� �̵����� �ʰ� �ٽ� ���ǹ��� Ÿ�Ե˴ϴ�.

			}
			System.out.println(i); // Ȧ���� ��µȴ�.
		}
	}
}
