package practice.q1;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        if (books == null) {
            books = new ArrayList<>();
        }
    }

    public void addBook(Book newBook) {
        books.add(newBook);
        System.out.println("도서 추가: \"" + newBook.getTitle() + "\" 추가");
    }

    public Book getBook(int isbn) {
        Book book = null;

        for (Book b : books) {
            if (b.getIsbn() == isbn) {
                book = b;
                return book;
            }
        }

        return book;
    }

    public void updateBook(int isbn, String title, String author) {
        for (Book b : books) {
            if (b.getIsbn() == isbn) {
                b.setTitle(title);
                b.setAuthor(author);
                System.out.println("도서 수정: ISBN이 \"%d\"인 도서의 제목을 \"%s\"으로 수정".formatted(isbn, title));
                return;
            }
        }
        System.out.println("ISBN이 일치하지 않습니다.");
    }

    public void deleteBook(int isbn) {
        for (int i = 0; i < books.size(); i ++) {
            if(books.get(i).getIsbn() == isbn) {
                books.remove(i);
                System.out.println("도서 삭제: ISBN이 \"%d\"인 도서 삭제".formatted(isbn));
                return;
            }
        }
        System.out.println("ISBN이 일치하지 않습니다.");
    }


}
