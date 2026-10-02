package exercise.q1;

/* Q1. 국어, 영어, 수학 점수를 입력받아 평균 점수가 60점 이상이면서 각 과목이 40점 이상이면 "합격입니다!"를 출력하세요.
 * 단, 평균 점수 미달인 경우 "평균 점수 미달로 불합격입니다."를 출력,
 * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격입니다."를 출력하세요.
 *
 * -- 입력 예시 --
 * 국어 점수를 입력하세요 : 60
 * 영어 점수를 입력하세요 : 30
 * 수학 점수를 입력하세요 : 20
 *
 * -- 출력 예시 --
 * 평균 점수 미달로 불합격입니다.
 * 영어 점수 미달로 불합격입니다.
 * 수학 점수 미달로 불합격입니다.
 * */


import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        int[] scores = new int[3];
        Scanner sc = new Scanner(System.in);

        // input loop
        for (int i = 0; i < scores.length; i++)
        {
            if(i == 0) {
                System.out.print("국어 점수를 입력하세요: ");
                scores[i] = sc.nextInt();
                sc.nextLine();
            } else if (i == 1) {
                System.out.print("영어 점수를 입력하세요: ");
                scores[i] = sc.nextInt();
                sc.nextLine();
            } else if (i==2) {
                System.out.print("수학 점수를 입력하세요: ");
                scores[i] = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("invalid Number");
                return;
            }
        }

        // 과락 확인 루프
        for (int i = 0; i < scores.length; i++)
        {
            if(scores[i] < 40) {
                if(i == 0) {
                    System.out.println("국어 점수 미달로 불합격입니다.");
                    return;
                } else if (i == 1) {
                    System.out.println("영어 점수 미달로 불합격입니다.");
                    return;
                } else if (i==2) {
                    System.out.println("수학 점수 미달로 불합격입니다.");
                    return;
                } else {
                    System.out.println("invalid Number");
                    return;
                }
            }
        }

        // 평균 계산 루프
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        if((sum / scores.length) >= 60) System.out.println("합격입니다.");
        else System.out.println("평균 점수 미달로 불합격입니다.");
    }
}
