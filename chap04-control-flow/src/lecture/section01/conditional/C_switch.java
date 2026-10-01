package lecture.section01.conditional;

import java.util.Scanner;

public class C_switch {
    public void calculatorWithSwitch() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        System.out.print("""
                원하는 연산 기호의 숫자를 입력하세요
                + : 1
                - : 2
                * : 3
                / : 4
                """);
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("+ 연산 결과입니다: %d".formatted(add(num1, num2)));
                break;
            case 2:
                System.out.println("- 연산 결과입니다: %d".formatted(subtract(num1, num2)));
                break;
            case 3:
                System.out.println("* 연산 결과입니다: %d".formatted(multiply(num1, num2)));
                break;
            case 4:
                System.out.println("/ 연산 결과입니다: %.1f".formatted(divide(num1, num2)));
                break;
            default:
                System.out.println("아무 케이스도 속하지 않는 경우입니다.");
                break;
        }
    }

    public void calculatorWithSwitch2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        System.out.print("""
                원하는 연산 기호의 숫자를 입력하세요
                + : 1
                - : 2
                * : 3
                / : 4
                """);
        int op = sc.nextInt();

        switch (op){
            case 1 -> System.out.println("+ 연산 결과입니다: %d".formatted(add(num1, num2)));
            case 2 -> System.out.println("- 연산 결과입니다: %d".formatted(subtract(num1, num2)));
            case 3 -> System.out.println("* 연산 결과입니다: %d".formatted(multiply(num1, num2)));
            case 4 -> System.out.println("/ 연산 결과입니다: %.1f".formatted(divide(num1, num2)));
            default -> System.out.println("아무 케이스도 속하지 않는 경우입니다.");
        }
    }


    public int add(int x, int y) {

        return x+y;
    }

    public int subtract(int x, int y) {

        return x-y;
    }

    public int multiply(int x, int y) {

        return x*y;
    }

    public double divide(int x, int y) {

        return (double)x/y;
    }
}
