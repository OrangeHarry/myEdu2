package com.orange.javaapi;

import java.util.Arrays;
import java.util.Random;

public class LotteMachine {
	static boolean oneTimePlug = true; // 당첨번호 1회만 출력..
	static int[] winNumber = new int[6];

	public static void main(String[] args) {
		int getCount = 0;

		for (int i = 0; i < 100; i++) {// 그냥 100번만 돌려보자
			getCount++;
			System.out.println("getCount value is " + getCount + "=========");
			if (LottoProcess() == true) {// 당첨됬을때
				getCount++;
				System.out.println("getCout win value is " + getCount + "==========");
				return;
			}
		}
	}
	
	public static boolean LottoProcess() {
		boolean winOk;

		int[] selectNumber = new int[6];
		Random random1 = new Random(); // 이렇게 void형으로 들어가면, 현재시간을 종자값으로 해서 인자값을 뿌려준다.
		System.out.println("선택번호 : ");

		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random1.nextInt(45) + 1;
			System.out.println("selectNumber value is " + selectNumber[i]);
			for (int j = 0; j < i; j++) {// 중복수 제거 로직
				if (selectNumber[i] == selectNumber[j]) {
					i--;
				}
			}
		}
		System.out.println("당첨번호 : ");
		if (oneTimePlug) {
			Random random2 = new Random();
			for (int j = 0; j < winNumber.length; j++) {
				winNumber[j] = random2.nextInt(45) + 1;
				for (int k = 0; k < j; k++) {// 중복수 제거 로직
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
		// 당첨 여부
		// 비교하기 전에 array는 먼저 sort한다.
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);

		boolean result = Arrays.equals(selectNumber, winNumber);
		if (result == true) {
			System.out.println("축하합니다~~ 1등 당첨!!");
			winOk = true;
		} else {
			System.out.println("다음 기회에....꽝!!");
			winOk = false;
		}

		return winOk;
	}
}
