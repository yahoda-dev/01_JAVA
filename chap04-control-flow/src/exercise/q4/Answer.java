package exercise.q4;

import java.util.ArrayList;
import java.util.Scanner;

/* Q4. 2 이상의 정수를 입력받아 해당 숫자까지의 소수를 모두 출력하고, 소수의 총 합을 출력하세요.
 *
 * -- 입력 예시 --
 * 정수를 입력하세요: 10
 *
 * -- 출력 예시 --
 * 2 3 5 7
 * 1부터 10까지 소수의 합: 17
 * */
public class Answer {
    public static void main(String[] args) {
        int value = 0, sum = 0;
        ArrayList<Integer> primeList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        value = sc.nextInt();

        for (int i = 2; i <= value; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) { // todo: AI에게 이 라인 질문함.. 찾아볼 것.
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeList.add(i);
            }
        }

        for(int i = 0; i < primeList.size(); i ++) {
            System.out.printf(primeList.get(i).toString() + " ");
            sum += primeList.get(i);
        }
        System.out.println(String.valueOf(sum));
    }
}
