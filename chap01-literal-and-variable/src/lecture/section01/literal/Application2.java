package lecture.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        // 정수끼리의 연산
        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456); // 곱
        System.out.println(123 / 456); // 나눈 몫
        System.out.println(123 % 456); // 나머지

        // 실수가 포함된 연산
        System.out.println("=== 실수가 포함된 연산 ===");
        System.out.println(10 / 4.0);
        System.out.println(0.1 + 0.2);
        // 결과: 0.30000000000000004
        // 원인: pc는 2진법 계산만 가능함. 이때 10진 소수를 2진 소수로 변환하지 못 하는 경우 근사값으로 변환하여 계산함.
        //      이로 인한 오차가 발생하는 경우가 있음.

        // 문자 연산
        System.out.println('a' + 'b');

        // 문자열 연산
        System.out.println("Hello" + " World");
        System.out.println("Hello " + 100);

        // System.out.println(false + true); // 논리형 타입 간 연산 불가능
    }
}
