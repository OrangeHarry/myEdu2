package com.orange.collect;

public class Book {
	// 필드
	private String title;
	private String writer;

	// 생성자
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}

	// 메소드
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
