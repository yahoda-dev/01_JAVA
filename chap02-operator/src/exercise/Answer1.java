package exercise;


/*
 * 문제 1. 초를 분과 초로 변환
 *
 * totalSeconds 변수에 125를 저장한다.
 * / 연산자로 분을 계산하고 % 연산자로 남은 초를 계산한다.
 * 계산한 결과는 각각 minutes와 seconds 변수에 저장한다.
 *
 * 실행 결과
 * 125초는 2분 5초입니다.
 */

public class Answer1 {
    public static void main(String[] args) {
        int totalSeconds = 125;
        String result = totalSeconds + "초는 " + (totalSeconds/60) + "분 " + (totalSeconds%60) + "초입니다.";
        System.out.println(result);
    }
}
