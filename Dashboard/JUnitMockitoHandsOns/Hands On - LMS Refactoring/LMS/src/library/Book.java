package library;

public class Book {
	private final String bookId;
	private final String bookTitle;
	private final String authorName;
	private final String publisherName;
	
	public String getBookId() {
		return bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	
	public Book(String bookId, String bookTitle, String authorName, String publisherName) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.publisherName = publisherName;
	}
	

}
