package lecture.section1.logical;

public class Application4 {
    public static void main(String[] args) {
        /*
        삼항연산자
        [문법]
        조건식 ? true일 경우 반환할 값 : false일 경우 반환할 값
        - 삼항연산자는 조건문 if와 비교되는 문법
        - 조건식은 true or false라는 boolean 값을 반환해야 한다.
        */

        int num = -10;
        boolean result;
        String resultStr = "";
        String resultStr2 = "";
        // num이 0보다 크면 "양수다"라고 콘솔에 출력하고
        // 0또는 0보다 작으면 "음수다"라고 콘솔에 출력

        resultStr = num > 0 ? "양수다" : (num == 0) ? "0이다" : "음수다";
        System.out.println(resultStr);


        System.out.println("========================================");
        /*
        점수에 따라 A, B, C 학점을 부여한다.
        A : 90점 이상
        B : 80점 이상
        C : 나머지 모두
        */
        int score = 79;
        String grade = "";
        grade = (score >= 90) ? "A" : (score >= 80) ? "B":"C";
        System.out.println("grade is " + grade);
    }
}