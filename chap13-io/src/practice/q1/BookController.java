package practice.q1;

public class BookController {
    private final Library library;
    private final BookView bookView;

    public BookController() {
        library = new Library();
        bookView = new BookView();
    }

    public void addBook(Book newBook) {
        if (newBook != null)
            library.addBook(newBook);
    }

    public void getBook(int isbn) {
        if (isbn < 0) {
            System.out.println("ISBN이 유효하지 않습니다.");
            return;
        }
        Book book = library.getBook(isbn);
        if (book != null)
            bookView.displayBook(book);
        else
            System.out.println("존재하지 않는 ISBN입니다. 다시 시도해 주세요.");
    }

    public void updateBook(int isbn, String title, String author) {
        if (isbn < 0) {
            System.out.println("ISBN이 유효하지 않습니다.");
            return;
        }

        library.updateBook(isbn, title, author);
    }

    public void deleteBook(int isbn) {
        library.deleteBook(isbn);
    }
}