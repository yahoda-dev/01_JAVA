package exercise.q1;


/* Q1. 정수형 배열에 저장된 값들을 순차 정렬(오름차순)하여 출력하세요.
 *
 * -- 입력 예시 --
 * 정수 5개를 입력하세요: 5 2 3 1 4
 *
 * -- 출력 예시 --
 * 정렬된 값: 1 2 3 4 5
 * */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 5개를 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
