package library;

import java.util.Date;

public class Transaction {
	private final Member member;
	private final Book book;
	private final int transactionId;
	private final String transactionType;
	private static final int NO_OF_BOOKS = 0;	
	private final Date transactionDate;
	private final Date bookTobeReturnDate;
	private final Date bookReturnDate;
	private final double penalty;
	
	public Transaction(Member member, Book book, int transactionId, String transactionType, Date transactionDate, 
		Date bookTobeReturnDate, Date bookReturnDate, double penalty) {
		super();
		this.member = member;
		this.book = book;
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.bookTobeReturnDate = bookTobeReturnDate;
		this.bookReturnDate = bookReturnDate;
		this.penalty = penalty;
	}
	public Member getMember() {
		return member;
	}
	public Book getBook() {
		return book;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public static int getNoOfBooks() {
		return NO_OF_BOOKS;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public Date getBookTobeReturnDate() {
		return bookTobeReturnDate;
	}
	public Date getBookReturnDate() {
		return bookReturnDate;
	}
	public double getPenalty() {
		return penalty;
	}

}

