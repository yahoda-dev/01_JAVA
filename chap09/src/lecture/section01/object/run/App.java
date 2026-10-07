package lecture.section01.object.run;

import lecture.section01.object.book.Book;

public class App {
    public static void main(String[] args) {
        Object object = new Object();


        // result: java.lang.Object@b4c966a
        // Object.toString()은 클래스명@16진수 형태의 주소값을 제공한다
        System.out.println(object);

        Book book = new Book(
                1, 50000, "홍길동전", "허균"
        );

        System.out.println(book);

    }
}