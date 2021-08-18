package com.orange.collect;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();

		list.add("���");
		list.add("ö��");
		list.add("�μ�");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("Vector value is [" + str + "]");
		}
		System.out.println("========================================");

		List<Book> list2 = new Vector<Book>();
		list2.add(new Book("�޷���Ʈ�� �� ��ȭ��", "�̹̾�"));
		list2.add(new Book("�Ϲ��� ���� 1%�� ���", "���ֿ�"));
		list2.add(new Book("���̾� ��ȭ���� ����", "�����ó� ���̰�"));

		for (int i = 0; i < list2.size(); i++) {
			Book book = (Book) list2.get(i);
			System.out.println("Book title value is [" + book.getTitle() + " : " + book.getWriter() + "]");
		}
	}
}
