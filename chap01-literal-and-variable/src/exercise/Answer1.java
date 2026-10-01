package exercise;


/*
 * 문제 1. 여러 종류의 리터럴 출력
 *
 * 다음 값을 알맞은 형태의 리터럴로 직접 출력한다.
 * - 문자열 Java
 * - 정수 100
 * - 실수 3.14
 * - 문자 A
 * - 논리값 true
 *
 * 실행 결과
 * Java
 * 100
 * 3.14
 * A
 * true
 */
public class Answer1 {
    public static void main(String[] args) {
        String strAnswer = "Java";
        int intAnswer = 100;
        double doubleAnswer = 3.14;
        char charAnswer = 'A';
        boolean boolAnswer = true;

        StringBuilder builder = new StringBuilder()
                .append(strAnswer).append("\n")
                .append(intAnswer).append("\n")
                .append(doubleAnswer).append("\n")
                .append(charAnswer).append("\n")
                .append(boolAnswer);

        System.out.println(builder);
    }
}
