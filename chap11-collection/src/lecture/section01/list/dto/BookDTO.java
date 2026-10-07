package lecture.section01.list.dto;

public class BookDTO {
    private int number, price;
    private String title, author;

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.price = price;
        this.title = title;
        this.author = author;
    }


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
        return "BookDTO{" +
                "number=" + number +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}