package com.orange.condition;

public class WhileBreak {
	public static void main(String[] args) {
		int count = 0;

		while (true) {
			System.out.println(count);
			count++;

			if (count == 10) {
				break; // 誇醮!!??六六六六六
			}
		}
		System.out.println("while is break....");
	}
}
