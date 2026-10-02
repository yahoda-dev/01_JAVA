package exercise.q2;

/* Q2. 받은 금액과 상품 가격을 입력받아 거스름돈을 대한민국 화폐 단위별로 계산하고 출력하세요.
 * 단, 지폐와 동전을 구분하여 단위를 표기하고, 부족한 금액은 에러 메시지를 출력하세요.
 *
 * -- 입력 예시 --
 * 받으신 금액을 입력하세요 : 100000
 * 상품 가격을 입력하세요 : 22340
 *
 * -- 출력 예시 --
 * ============================
 * 50000원권 지폐 1장
 * 10000원권 지폐 2장
 * 5000원권 지폐 1장
 * 1000원권 지폐 2장
 * 500원권 동전 1개
 * 100원권 동전 1개
 * 50원권 동전 1개
 * 10원권 동전 1개
 * ============================
 * 거스름돈 : 77660원
 * */

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int money, price, change;
        Scanner sc = new Scanner(System.in);

        System.out.printf("받으신 금액을 입력하세요: ");
        money = sc.nextInt();

        sc.nextLine();

        System.out.printf("상품 가격을 입력하세요: ");
        price = sc.nextInt();

        change = money - price;
        System.out.println("받은 금액: %d\n상품 가격: %d\n거스 름돈: %d".formatted(money, price, change));
        // todo: 변수명 리팩터링 필요
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
        while (change > 50) {
            if (change > 50000) {
                a = change / 50000;
                change %= 50000;
            } else if (change > 10000) {
                b = change / 10000;
                change %= 10000;
            } else if (change > 5000) {
                c = change / 5000;
                change %= 5000;
            } else if (change > 1000) {
                d = change / 1000;
                change %= 1000;
            } else if (change > 500) {
                e = change / 500;
                change %= 500;
            } else if (change > 100) {
                f = change / 100;
                change %= 100;
            } else if (change > 50) {
                g = change / 50;
                change %= 50;
            }
        }
        h = change / 10;
        System.out.println("""
                50000원 %d장
                10000원 %d장
                5000원 %d장
                1000원 %d장
                500원 %d개
                100원 %d개
                50원 %d개
                10원 %d개                
                """.formatted(a, b, c, d, e, f, g, h));

    }
}
