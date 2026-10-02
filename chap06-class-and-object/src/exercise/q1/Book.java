package exercise.q1;

public class Book {
// 제목(title, 문자열), 저자(author, 문자열), 가격(price, 정수)
    private String title, author;
    private int price;
    Book(
            String title, String author, int price
    ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
