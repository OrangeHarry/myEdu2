package com.orange.collect;

public class Book {
	// �ʵ�
	private String title;
	private String writer;

	// ������
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}

	// �޼ҵ�
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}
