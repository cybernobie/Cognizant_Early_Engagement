import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1.Add Book\n" +
                    "2.Display all book details\n" +
                    "3.Search Book by author \n" +
                    "4.Count number of books - by book name\n" +
                    "5.Exit\n" +
                    "Enter your choice:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: {
                    System.out.println("Enter the isbn no:");
                    int isbn = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter the book name:");
                    String bookName = scanner.nextLine();

                    System.out.println("Enter author name:");
                    String authorName = scanner.nextLine();

                    Book book = new Book();
                    book.setIsbnno(isbn);
                    book.setBookName(bookName);
                    book.setAuthor(authorName);

                    library.addBook(book);
                    break;
                }
                case 2: {
                    for (Book book : library.getBookList()) {
                        System.out.println("ISBN no: " + book.getIsbnno());
                        System.out.println("Book name: " + book.getBookName());
                        System.out.println("Author name: " + book.getAuthor());
                    }

                    break;
                }
                case 3: {
                    System.out.println("Enter the author name:");
                    String authorName = scanner.nextLine();
                    List<Book> books = library.viewBooksByAuthor(authorName);

                    if (books.isEmpty()) {
                        System.out.println("None of the book published by the author " + authorName);
                    } else {
                        for (Book book : books) {
                            System.out.println("ISBN no: " + book.getIsbnno());
                            System.out.println("Book name: " + book.getBookName());
                            System.out.println("Author name: " + book.getAuthor());
                        }
                    }

                    break;
                }
                case 4: {
                    System.out.println("Enter the book name:");
                    String bookName = scanner.nextLine();
                    int count = library.countnoofbook(bookName);
                    System.out.println(count);
                }
                case 5: {
                    System.exit(0);
                }
            }
        }
    }
}