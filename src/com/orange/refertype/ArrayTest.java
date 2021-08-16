package com.orange.refertype;

public class ArrayTest {
	public static void main(String[] args) {
		int[] ages = { 10, 20, 30, 40 };// Array 선언과 생성 타입 1
		int score[] = { 100, 90, 80, 70 };// Array 선언과 생성 타입2

//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
//		System.out.println(ages[2]);
//		System.out.println(ages[3]);
//
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);

		System.out.println("ages.length value is " + ages.length);
		for (int i = 0; i < ages.length; i++) {
			System.out.println("ages[" + i + "]" + ages[i]);
		}
		System.out.println("score.length valu is " + score.length);
		for (int j = 0; j < score.length; j++) {
			System.out.println("score[" + j + "]" + score[j]);
		}
	}
}
