package lecture.section01.object.run;

import lecture.section01.object.book.Book;

public class App2 {
    public static void main(String[] args) {

        Book book1 = new Book(
                1, 50000, "홍길동전", "허균"
        );
        Book book2 = new Book(
                1, 50000, "홍길동전", "허균"
        );
        Book book3 = book2;

        System.out.println("book1 book2 equals 비교: " + book1.equals(book2));
        System.out.println("book2 book3 equals 비교: " + book2.equals(book3));
        System.out.println("book1 book3 equals 비교: " + book1.equals(book3));
        System.out.println("book1 book2 연산자 비교: " + (book1 == book2));
        System.out.println("book2 book3 연산자 비교: " + (book2 == book3));
        System.out.println("book1 book3 연산자 비교: " + (book1 == book3));
    }
}