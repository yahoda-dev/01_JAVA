package exercise.q1;

import java.util.Scanner;

/* Q1. Scanner 를 이용한 대화형 사칙연산 계산기를 만드세요.
 * 두 정수와 연산 기호(+, -, *, /)를 입력 받아 결과를 출력합니다.
 * 단,
 * - 0 으로 나누는 경우 "0 으로 나눌 수 없습니다." 를 출력 후 종료
 * - 위 4가지 외 연산 기호가 입력되면 "지원하지 않는 연산입니다." 를 출력 후 종료
 *
 * -- 입력 예시 --
 * 첫 번째 정수 : 12
 * 두 번째 정수 : 4
 * 연산 기호(+, -, *, /) : /
 *
 * -- 출력 예시 --
 * 12 / 4 = 3
 * */
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Answer object = new Answer();

        int num1, num2;
        char sign;

        System.out.print("첫 번째 정수를 입력하세요: " );
        num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: " );
        num2 = sc.nextInt();

        System.out.println("연산 기호(+, -, *, /)를 입력하세요: ");
        sign = sc.next().charAt(0);

        switch (sign){
            case '+' -> System.out.println("%d %c %d = %d".formatted(num1, sign, num2, num1+num2));
            case '-' -> System.out.println("%d %c %d = %d".formatted(num1, sign, num2, num1-num2));
            case '*' -> System.out.println("%d %c %d = %d".formatted(num1, sign, num2, num1*num2));
            case '/' -> System.out.println("%d %c %d = %.1f".formatted(num1, sign, num2, (double)num1/(double)num2));
            default -> {
                System.out.println("지원하지 않는 연산입니다.");
                return;
            }
        }
    }
}
