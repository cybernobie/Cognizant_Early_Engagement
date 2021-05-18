package library;

import java.util.ArrayList;

public class BookDAO {

	ArrayList<Book> l =  new ArrayList<Book>();
	
	public void addBook(Book obj){
		l.add(obj);
	}
	
	public void removeBook(Book obj)
	{
		l.remove(obj);
	}
	
	public void viewBookDAO()
	{
		for(int i=0;i<l.size();i++)
		{
			System.out.println("Book Id:" + l.get(i).getBookId());
			System.out.println("Book Title:" + l.get(i).getBookTitle());
			System.out.println("Author Name:" + l.get(i).getAuthorName());
			System.out.println("Publisher Name:" + l.get(i).getPublisherName());
			
		}
	}
}
