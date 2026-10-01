package lecture.section01.conditional;

import java.util.Scanner;

public class B_if_elseif {
    private final Scanner scanner;

    B_if_elseif(Scanner scanner) {
        this.scanner = scanner;
    }

    public void testSimpleIf() {
        /*
        전달된 정수가 짝수면 "짝수입니다." 아니면 "홀수입니다."
        */
        System.out.printf("정수를 입력하세요: ");
        int num = scanner.nextInt();

        if(num == 0) System.out.println("0입니다.");
        else if(num % 2 == 0) System.out.println("짝수입니다.");
        else System.out.println("홀수입니다.");

        System.out.printf("프로그램을 종료합니다.");
    }
}
