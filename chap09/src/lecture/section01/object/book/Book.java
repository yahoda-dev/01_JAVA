package lecture.section01.object.book;

import java.util.Objects;

public class Book {
    private int number, price;
    private String title, author;

    /* Constructor */
    public Book() {
    }

    public Book(int number, int price, String title, String author) {
        this.number = number;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    /* Properties */
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        // 인자 객체가 null이거나(또는) 현재 클래스와 인자 객체의 클래스가 일치하지 않는다면 False
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        // 객체 내 필드가 모두 같으면 True, 하나라도 틀리면 False
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, price, title, author);
    }
}
