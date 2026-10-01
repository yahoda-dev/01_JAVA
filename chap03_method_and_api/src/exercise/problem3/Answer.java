package exercise.problem3;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Answer answer = new Answer();
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력: ");
        firstNumber = sc.nextInt();
        System.out.print("두 번째 정수 입력: ");
        secondNumber = sc.nextInt();

        if(firstNumber != 0 && secondNumber != 0) {
            System.out.println("덧셈 결과 : %d".formatted(answer.add(firstNumber, secondNumber)));
            System.out.println("뺄셈 결과 : %d".formatted(answer.subtract(firstNumber, secondNumber)));
            System.out.println("곱셈 결과 : %d".formatted(answer.multiply(firstNumber, secondNumber)));
            System.out.println("나눗셈 결과 : %.1f".formatted(answer.divide(firstNumber, secondNumber)));
        }
    }

    private int add(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }

    private int subtract(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        return result;
    }

    private int multiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        return result;
    }

    private double divide(int firstNum, int secondNum) {
        double result = (double) firstNum / secondNum;
        return result;
    }
}
