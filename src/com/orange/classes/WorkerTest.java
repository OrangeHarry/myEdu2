package com.orange.classes;

public class WorkerTest {
	public static void main(String[] args) {
		System.out.println("------Object New-----Start------");
		Worker worker = new Worker();// �̷��� new�� �����ϸ� ��ü�� �����Ȱ��Դϴ�.
		// ������ worker��� ������ ��Ƶξ����ϴ�.
		Worker worker2 = new Worker();// �ι�° ��ü�� ��������ϴ�.
		System.out.println("woker�� woker2�� ���� ���� �ٸ� ��ü�Դϴ�.");
		System.out.println("-------Object New-----End-------");
	}
}
