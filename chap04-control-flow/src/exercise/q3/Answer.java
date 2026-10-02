package exercise.q3;

/* Q3. 문자열을 입력받아 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 시저 암호를 작성하세요.
 * 단, 입력된 문자열은 영문자와 공백으로만 이루어져야 하며, 밀리는 숫자는 0보다 큰 정수입니다.
 *
 * -- 입력 예시 --
 * 문자열을 입력하세요 : a B z
 * 숫자를 입력하세요 : 4
 *
 * -- 출력 예시 --
 * e F d
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        String alphabets = "";
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        alphabets = sc.nextLine();

        System.out.printf("숫자를 입력하세요: ");
        num = sc.nextInt();

        char[] array = alphabets.toCharArray();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (array[i] < 'A' || array[i] > 'z') {

            } else {
                // todo: 알파벳 범위 초과할 경우 보정 로직 추가 구현 필요
                array[i] = (char) (array[i] + 4);
            }
        }

        System.out.println("\nresult: " + String.valueOf(array));
    }
}
