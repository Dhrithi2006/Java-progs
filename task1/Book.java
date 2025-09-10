package library;

public class Book implements Issuable {
    private String title;
    private String author;
    private String isbn;
    private boolean issued;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.issued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean issue() {
        if (!issued) {
            issued = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook() {
        if (issued) {
            issued = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isAvailable() {
        return !issued;
    }
}
