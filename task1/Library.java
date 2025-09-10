package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public boolean issueBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            return book.issue();
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            return book.returnBook();
        }
        return false;
    }

    public boolean isAvailable(String isbn) {
        Book book = findBookByIsbn(isbn);
        return book != null && book.isAvailable();
    }
}