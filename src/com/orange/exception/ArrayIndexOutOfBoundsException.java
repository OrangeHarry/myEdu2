package com.orange.exception;

public class ArrayIndexOutOfBoundsException {
		public static void main(String[] args) {
			String[] name = {"���", "����", "����"};
			System.out.println(name[0]);
			System.out.println(name[1]);
			System.out.println(name[2]);
//			System.out.println(name[3]);
		}
}
