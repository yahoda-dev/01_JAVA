package exercise.q2;


import java.util.Arrays;
import java.util.Scanner;

/* Q2. 3x3 크기의 정수형 가변 배열을 선언하고 값을 입력받아 저장한 후, 각 행의 합계를 출력하세요.
 *
 * -- 입력 예시 --
 * 배열 값을 입력하세요:
 * 1 2
 * 3 4 5
 * 6
 *
 * -- 출력 예시 --
 * 행 1의 합: 3
 * 행 2의 합: 12
 * 행 3의 합: 6
 * */
public class Answer {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 값을 입력하세요: ");
        for (int i = 0; i < arr.length; i ++) {
            String line = sc.nextLine().trim();

            String[] tokens = line.split("\\s+");

            arr[i] = new int[tokens.length];

            for (int j = 0; j < tokens.length; j++) {
                arr[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.print("행 %d의 합: %d\n".formatted(i+ 1, sum));
            sum = 0;
        }
    }
}