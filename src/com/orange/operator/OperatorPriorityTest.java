package com.orange.operator;

public class OperatorPriorityTest {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;

		int result = x + y * z;// ���ϱ⸦ ��������
		System.out.println("result value is " + result);

		int result2 = (x + y) * z;// ��ȣ�� ���� �������
		System.out.println("result2 value is " + result2);

		int result3 = x + (y * z); // �׳� �´� ��Ȳ�� ��ȣ�� ���� ���Ҷ� ã�� ���ϰ�
		System.out.println("result3 value is " + result3);
	}
}
