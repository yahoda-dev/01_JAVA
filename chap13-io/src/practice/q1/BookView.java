package practice.q1;

public class BookView {
    public void displayBook(Book book) {
        System.out.println(
                "도서 조회: ISBN이 %d인 도서 조회\n제목 : %s/작가: %s".formatted(
                        book.getIsbn(), book.getTitle(), book.getAuthor()
                )
        );
    }

    public void displayBookList() {
        /*
        고민
        1. Library에 직접 접근은 Controller로만 하는 것이 이상적일 것 같음.
        2. 그러나 BookView에서 리스트를 뿌리려면 library 객체 혹은 books 리스트가 필요함
        3. 이 경우 2 구현을 위해 library를 getter로 획득하는 것까지는 허용 범위일지
        */
    }

    public void displayMessage() {

    }

}
