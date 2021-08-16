package com.orange.classes;

public class TV {
	String company = "";
	String madeDate = "";
	String name = "";
	String color = "";

	public TV() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("TV default constructor is call");
	}

	public TV(String company) {
		super();
		this.company = company;
		System.out.println("Tv constructor param1 is call.");
	}

	public TV(String company, String madeDate) {
		super();
		this.company = company;
		this.madeDate = madeDate;
		System.out.println("Tv constructor param2 is call.");
	}

	public TV(String company, String madeDate, String name) {
		super();
		this.company = company;
		this.madeDate = madeDate;
		this.name = name;
		System.out.println("Tv constructor param3 is call.");
	}

	public TV(String company, String madeDate, String name, String color) {
		super();
		this.company = company;
		this.madeDate = madeDate;
		this.name = name;
		this.color = color;
		System.out.println("Tv constructor param4 is call.");
	}

}
