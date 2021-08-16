package com.orange.javaapi;

public class SystemAPITest {
	public static void main(String[] args) {

		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.version"));

		for (int i = 0; i < 1001; i++) {
			System.out.println(i);
			if (i == 799) {
				System.out.println(i+" gc!");
				System.gc();
			}else if (i == 900) {
				System.out.println(i+" exit!!");
				System.exit(0);
			} else {

			}
		}
	}
}
