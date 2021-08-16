package com.orange.javaapi;

public class SystemAPI02Test {
	public static void main(String[] args) {
		long startTime = 0;
		long endTime = 0;

		for (int i = 0; i < 999999; i++) {
			System.out.println(i);
			if (i == 0) {
				startTime = System.currentTimeMillis();
			} else if (i == 899999) {
				endTime = System.currentTimeMillis();
				System.out.println("총 소요시간은 = " + (endTime - startTime) / 1000+"초");
				// 밀리세크 단위라서 초를 구하려면 1000으로 나누어야 한다.
				System.exit(0);
			}
		}
	}
}
