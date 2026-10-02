package exercise.q5;

/* Q5. 사용자가 정수를 입력하여 높이를 지정하면 해당 높이의 피라미드를 별(*)로 출력하세요.
 *
 * -- 입력 예시 --
 * 높이를 입력하세요: 4
 *
 * -- 출력 예시 --
 *    *
 *   ***
 *  *****
 * *******
 * */

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int height;
        Scanner sc = new Scanner(System.in);

        System.out.print("높이를 입력하세요: ");
        height = sc.nextInt();
        int count = 1;

        while(height > 0) {
            for (int i = 0; i < height; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
            count += 2;
            height--;
            System.out.println();
        }

    }
}
