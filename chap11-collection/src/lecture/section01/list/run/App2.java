package lecture.section01.list.run;

import lecture.section01.list.comp.SortPrice;
import lecture.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        System.out.println("== 정렬 전 ==");
        for (BookDTO book : bookList) {
            System.out.println("book = " + book.toString());
        }

        bookList.sort(new SortPrice());


        System.out.println("== 오름차순 정렬 후 ==");
        for (BookDTO book : bookList) {
            System.out.println("book = " + book.toString());
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                int result = 0;
                result = o1.getPrice() >= o2.getPrice() ? -1 : 1;
                return  result;
            }
        });

        System.out.println("== 내림차순 정렬 후 ==");
        for (BookDTO book : bookList) {
            System.out.println("book = " + book.toString());
        }

    }
}
