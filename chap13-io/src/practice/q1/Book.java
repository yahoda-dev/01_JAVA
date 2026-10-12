package practice.q1;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isForeignBook;

    public Book() {
    }

    public Book(String title, String author, int isbn, boolean isForeignBook) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isForeignBook = isForeignBook;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setForeignBook(boolean foreignBook) {
        isForeignBook = foreignBook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isForeignBook() {
        return isForeignBook;
    }
}
