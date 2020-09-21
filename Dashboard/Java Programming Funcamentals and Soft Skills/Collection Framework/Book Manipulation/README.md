# Book Manipulation

The district central library needs an application to store book details of their library. The clerk who has all the rights to add a new book,search for any book,display the book details and should update the count of total number of books.

You are provided with a  Book with the following private attributes:

- int isbnno
- String bookName
- String author

Needed getters and setters are written.

Create a class Library with the following private attribute:

- ArrayList<Book> bookList = new  ArrayList<Book>();

Also provide the necessary setter and getter methods.  
Include the following public methods:

- `void addBook(Book bobj)` - This method should add the book object to the booklist.
- `boolean isEmpty()` -  This method should return true if the booklist is empty else return false.
- `ArrayList<Book> viewAllBooks()` - This method should return the list of books maintained in the library.
- `ArrayList<Book> viewBooksByAuthor(String author)` -  This method should return a list of books written by the author passed as argument. When you display an empty list it should print the message "The list is empty".
- `int countnoofbook(String bname)` -  this method should return the count of books with the name passed as argument.

Write a Main class to test the above functionalities.

> Sample Input and Output:

    1.Add Book
    2.Display all book details
    3.Search Book by author 
    4.Count number of books - by book name
    5.Exit
    Enter your choice:
    1
    Enter the isbn no:
    123
    Enter the book name:
    Java
    Enter the author name:
    Bruce Eckel
    1.Add Book
    2.Display all book details
    3.Search Book by author 
    4.Count number of books - by book name
    5.Exit
    Enter your choice:
    1
    Enter the isbn no:
    124
    Enter the book name:
    C++
    Enter the author name:
    Eric Nagler
    1.Add Book
    2.Display all book details
    3.Search Book by author 
    4.Count number of books - by book name
    5.Exit
    Enter your choice:
    3
    Enter the author name:
    Henry
    None of the book published by the author Henry
    1.Add Book
    2.Display all book details
    3.Search Book by author 
    4.Count number of books - by book name
    5.Exit
    Enter your choice:
    3
    Enter the author name:
    Eric Nagler
    ISBN no: 124
    Book name: C++
    Author name: Eric Nagler
    1.Add Book
    2.Display all book details
    3.Search Book by author 
    4.Count number of books - by book name
    5.Exit
    Enter your choice:
    5