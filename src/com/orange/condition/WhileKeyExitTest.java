package com.orange.condition;

import java.io.IOException;

public class WhileKeyExitTest {
	public static void main(String[] args) throws IOException {
		boolean isRun = true;
		int keyCode = 0;

		while (isRun) {// true��� ��ӽ���
			keyCode = System.in.read();// Ű�� �Է¹޽��ϴ�.
			if (keyCode == 49) {// ����1�� Ű�ڵ��Դϴ�.
				isRun = false;// While Ż��
			} else {
				System.out.println("keyCode value is " + keyCode);
			}
		}
		System.out.println("Program is End..");
	}
}
