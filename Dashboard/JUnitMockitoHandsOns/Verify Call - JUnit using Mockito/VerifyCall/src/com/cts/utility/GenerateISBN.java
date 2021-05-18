package com.cts.utility;

// System Under Test
public class GenerateISBN {
	private Book book; // Dependency that has to be mocked

	public GenerateISBN(Book book) {
		super();
		this.book = book;
	}
	
	// Method to be tested
	public Book assignISBN(String isbn) {
		if(isbn.matches("ISBN[0-9]{4}")) {
			book.setIsbn(isbn);
		}else {
			throw new RuntimeException("Invalid Code");
		}
		return book;
	}
}
