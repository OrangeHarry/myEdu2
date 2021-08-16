package com.orange.javaapi;

import java.util.Arrays;
import java.util.Random;

public class LotteMachine {
	static boolean oneTimePlug = true; // ��÷��ȣ 1ȸ�� ���..
	static int[] winNumber = new int[6];

	public static void main(String[] args) {
		int getCount = 0;

		for (int i = 0; i < 100; i++) {// �׳� 100���� ��������
			getCount++;
			System.out.println("getCount value is " + getCount + "=========");
			if (LottoProcess() == true) {// ��÷������
				getCount++;
				System.out.println("getCout win value is " + getCount + "==========");
				return;
			}
		}
	}
	
	public static boolean LottoProcess() {
		boolean winOk;

		int[] selectNumber = new int[6];
		Random random1 = new Random(); // �̷��� void������ ����, ����ð��� ���ڰ����� �ؼ� ���ڰ��� �ѷ��ش�.
		System.out.println("���ù�ȣ : ");

		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random1.nextInt(45) + 1;
			System.out.println("selectNumber value is " + selectNumber[i]);
			for (int j = 0; j < i; j++) {// �ߺ��� ���� ����
				if (selectNumber[i] == selectNumber[j]) {
					i--;
				}
			}
		}
		System.out.println("��÷��ȣ : ");
		if (oneTimePlug) {
			Random random2 = new Random();
			for (int j = 0; j < winNumber.length; j++) {
				winNumber[j] = random2.nextInt(45) + 1;
				for (int k = 0; k < j; k++) {// �ߺ��� ���� ����
					if (winNumber[j] == winNumber[k]) {
						j--;
					}
				}
				System.out.println("winNumber value is " + winNumber[j]);
			}
			oneTimePlug = false;
		} else {
			for (int j = 0; j < winNumber.length; j++) {
				System.out.println("winNumber value is " + winNumber[j]);
			}
		}
		// ��÷ ����
		// ���ϱ� ���� array�� ���� sort�Ѵ�.
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);

		boolean result = Arrays.equals(selectNumber, winNumber);
		if (result == true) {
			System.out.println("�����մϴ�~~ 1�� ��÷!!");
			winOk = true;
		} else {
			System.out.println("���� ��ȸ��....��!!");
			winOk = false;
		}

		return winOk;
	}
}
