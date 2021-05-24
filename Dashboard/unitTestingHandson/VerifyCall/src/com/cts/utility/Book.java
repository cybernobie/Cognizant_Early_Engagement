package com.cts.utility;

public class Book {
	private String name;
	private String isbn;
	public Book(String name) {
		super();
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name+" "+isbn;
	}
}
