package practice.q1;


import java.util.function.Consumer;
import java.util.function.Function;

/* Q1. 메소드 참조(`클래스::메소드`, `객체::메소드`, `클래스::인스턴스 메소드`) 의 세 가지 형태를
 *  Lambda 와 비교하며 사용해 보세요.
 *
 *  복습 포인트:
 *  - 메소드 참조의 개념을 이해하고 사용할 수 있다.
 *  - 클래스::메소드, 객체::메소드 구문을 활용할 수 있다.
 *
 *  조건:
 *   ① Function<String, Integer> 으로 문자열을 정수로 변환하는 람다를 정의하고,
 *      그것을 'Integer::parseInt' 메소드 참조로 동일하게 정의해 두 결과를 출력
 *
 *   ② Consumer<String> 으로 "받은 문자열을 그대로 출력" 하는 람다를 정의하고,
 *      그것을 'System.out::println' 메소드 참조(객체::메소드) 로 동일하게 정의해 호출
 *
 *   ③ Function<String, Integer> 으로 "문자열의 길이를 반환" 하는 람다를 정의하고,
 *      그것을 'String::length' 메소드 참조(클래스::인스턴스 메소드) 로 동일하게 정의해 결과 출력
 *
 * -- 출력 예시 --
 * 람다  parseInt("100") : 100
 * 참조  parseInt("100") : 100
 * 람다  Hello (Consumer)
 * 참조  Hello (Consumer)
 * 람다  length("Lambda") : 6
 * 참조  length("Lambda") : 6
 * */
public class Answer {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s1 -> Integer.parseInt(s1);
        Function<String, Integer> func2 = Integer::parseInt;

        System.out.println("람다  parseInt(\"100\") : " + func1.apply("100"));
        System.out.println("참조  parseInt(\"100\") : " + func2.apply("100"));

        Consumer<String> consumer1 = str -> System.out.println(str);
        Consumer<String> consumer2 = System.out::println;

        consumer1.accept("Hello");
        consumer2.accept("Hello");

        func1 = s1 -> s1.length();
        func2 = String::length;

        System.out.println("람다  length(\"Lambda\") : " + func1.apply("lambda"));
        System.out.println("참조  length(\"Lambda\") : " + func2.apply("lambda"));




    }
}
