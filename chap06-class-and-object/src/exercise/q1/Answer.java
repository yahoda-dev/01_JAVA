package exercise.q1;


/* Q1. 다음 조건에 맞는 클래스를 작성하고, 인스턴스를 생성하여 필드를 출력하세요.
 *
 * 복습 포인트:
 * - 추상화를 이해하고 설명할 수 있다.
 * - 객체를 추상화하여 클래스를 작성하고 이를 활용할 수 있다.
 *
 * 클래스명: Book
 * 필드: 제목(title, 문자열), 저자(author, 문자열), 가격(price, 정수)
 *
 * 생성자: 모든 필드를 매개변수로 받아 초기화하는 생성자
 *
 * 인스턴스 생성: 제목은 "자바의 정석", 저자는 "남궁성", 가격은 30000으로 설정
 *
 * 출력 예시:
 * 제목: 자바의 정석
 * 저자: 남궁성
 * 가격: 30000
 * */

public class Answer {
    public static void main(String[] args) {
        Book book = new Book(
                "자바의 정석",
                "남궁성",
                30000
        );

        System.out.println("제목: %s\n저자: %s\n가격: %d".formatted(
                book.getTitle(), book.getAuthor(), book.getPrice()
        ));
    }
}
