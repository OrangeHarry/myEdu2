package com.orange.collect;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();

		list.add("헌민");
		list.add("철수");
		list.add("민수");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("Vector value is [" + str + "]");
		}
		System.out.println("========================================");

		List<Book> list2 = new Vector<Book>();
		list2.add(new Book("달러구트의 꿈 백화점", "이미애"));
		list2.add(new Book("하버드 상위 1%의 비밀", "정주영"));
		list2.add(new Book("나미야 잡화점의 기적", "히가시노 게이고"));

		for (int i = 0; i < list2.size(); i++) {
			Book book = (Book) list2.get(i);
			System.out.println("Book title value is [" + book.getTitle() + " : " + book.getWriter() + "]");
		}
	}
}
