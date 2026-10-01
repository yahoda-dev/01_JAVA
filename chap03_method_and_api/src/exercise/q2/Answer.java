package exercise.q2;


/* Q2.
 * 사용자에게 다음 정보를 차례로 입력 받아 그대로 출력하세요.

 *
 * ① 정수 한 개 (nextInt 사용)
 * ② 이름 한 줄 (nextLine 사용. 공백을 포함할 수 있음)
 * ③ 한 단어로 된 좋아하는 색 (next 사용)
 *

 * 참고, nextInt() 다음에 nextLine() 을 호출하면
 * 엔터(개행 문자)가 그대로 남아있어 의도치 않게 빈 문자열이 입력되는 문제가 있습니다.
 * 이 문제를 해결하려면 nextInt() 호출 직후에 sc.nextLine() 을 한 번 더 호출해
 * 남아있는 개행을 비워줘야 합니다.
 *

 * -- 입력 예시 --
 * 나이를 입력하세요 : 25
 * 이름을 입력하세요 : 홍 길동
 * 좋아하는 색을 한 단어로 입력하세요 : 파랑
 *

 * -- 출력 예시 --
 * 나이 : 25
 * 이름 : 홍 길동
 * 좋아하는 색 : 파랑
 * */

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int age;
        String name, favoriteColor;
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();

        System.out.print("좋아하는 색을 한 단어로 입력하세요 : ");
        favoriteColor = sc.next();

        System.out.print("""
                나이: %d
                이름 : %s
                좋아하는 색 : %s
                """.formatted(age, name, favoriteColor));
    }
}
