package com.orange.classes;

public class TVConstructorOverloadingTest {
	public static void main(String[] args) {
		TV tv = new TV();
		TV tv2 = new TV("삼성");
		TV tv3 = new TV("엘지", "2021.02.15");
		TV tv4 = new TV("애플", "2021.05.30", "티브잉");
		TV tv5 = new TV("대우", "2021.03.22", "무한티비", "검정");

		System.out.println("tv value is [" + tv.company + "]");
		System.out.println("tv value is [" + tv.madeDate + "]");
		System.out.println("tv value is [" + tv.name + "]");
		System.out.println("tv value is [" + tv.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv2 value is [" + tv2.company + "]");
		System.out.println("tv2 value is [" + tv2.madeDate + "]");
		System.out.println("tv2 value is [" + tv2.name + "]");
		System.out.println("tv2 value is [" + tv2.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv3 value is [" + tv3.company + "]");
		System.out.println("tv3 value is [" + tv3.madeDate + "]");
		System.out.println("tv3 value is [" + tv3.name + "]");
		System.out.println("tv3 value is [" + tv3.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv4 value is [" + tv4.company + "]");
		System.out.println("tv4 value is [" + tv4.madeDate + "]");
		System.out.println("tv4 value is [" + tv4.name + "]");
		System.out.println("tv4 value is [" + tv4.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv5 value is [" + tv5.company + "]");
		System.out.println("tv5 value is [" + tv5.madeDate + "]");
		System.out.println("tv5 value is [" + tv5.name + "]");
		System.out.println("tv5 value is [" + tv5.color + "]");
	}
}
