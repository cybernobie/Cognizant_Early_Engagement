package com.cts.utility;

public class GenerateISBN {
	private Book book;

	public GenerateISBN(Book book) {
		super();
		this.book = book;
	}
	
	public Book assignISBN(String isbn) {
		if(isbn.matches("ISBN[0-9]{4}")) {
			book.setIsbn(isbn);
		}else {
			throw new RuntimeException("Invalid Code");
		}
		return book;
	}
}
