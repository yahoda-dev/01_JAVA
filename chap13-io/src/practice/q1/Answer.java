package practice.q1;


import java.util.Scanner;

/* Q1. 도서 관리 프로그램을 표준 입출력(Scanner 및 콘솔)을 이용해 MVC2 패턴으로 작성하세요.
 *
 * 복습 포인트:
 * - 컬렉션과 자료구조를 이용하여 데이터를 관리하고 CRUD 작업을 수행할 수 있다.
 * - MVC2 패턴을 이해하고 적용할 수 있다.
 *
 * 클래스명: Book
 * 필드: 제목(title, 문자열), 저자(author, 문자열), ISBN(isbn, 정수), 해외 서적 여부(isForeignBook, boolean)
 *
 * 클래스명: Library
 * 필드: 도서 목록(books, ArrayList<Book>)
 * 메소드: 도서 추가(addBook), 도서 조회(getBook), 도서 수정(updateBook), 도서 삭제(deleteBook)
 *
 * 클래스명: BookController
 * 메소드: 도서 추가(addBook), 도서 조회(getBook), 도서 수정(updateBook), 도서 삭제(deleteBook)
 *
 * 클래스명: BookView
 * 메소드: 도서 정보 출력(displayBook), 도서 목록 출력(displayBookList), 메시지 출력(displayMessage)
 *
 * 조건:
 * - 도서를 추가하고, 특정 ISBN으로 도서를 조회하고, 도서를 수정하고, 도서를 삭제하는 기능을 구현
 *
 * 출력 예시:
 * 도서 추가: "Effective Java" 추가
 * 도서 조회: ISBN이 "123456"인 도서 조회
 * 도서 수정: ISBN이 "123456"인 도서의 제목을 "Effective Java 3rd Edition"으로 수정
 * 도서 삭제: ISBN이 "123456"인 도서 삭제
 * */
public class Answer {
    public static void main(String[] args) {
        BookController controller = new BookController();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("도서 관리 프로그램");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("제목: ");
                    String title = scanner.nextLine();
                    System.out.print("저자: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    int isbn = scanner.nextInt();
                    System.out.print("해외 서적 여부(true/false): ");
                    boolean isForeignBook = scanner.nextBoolean();
                    controller.addBook(new Book(title, author, isbn, isForeignBook));
                    break;
                case 2:
                    System.out.print("조회할 도서의 ISBN: ");
                    isbn = scanner.nextInt();
                    controller.getBook(isbn);
                    break;
                case 3:
                    System.out.print("수정할 도서의 ISBN: ");
                    isbn = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("새로운 제목: ");
                    title = scanner.nextLine();
                    System.out.print("새로운 저자: ");
                    author = scanner.nextLine();
                    controller.updateBook(isbn, title, author);
                    break;
                case 4:
                    System.out.print("삭제할 도서의 ISBN: ");
                    isbn = scanner.nextInt();
                    controller.deleteBook(isbn);
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }



    }
}
