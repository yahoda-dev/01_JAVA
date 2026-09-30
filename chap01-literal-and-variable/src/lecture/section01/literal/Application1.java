package lecture.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        // 숫자 형태의 값
        System.out.println(1); // 정수형
        System.out.println(1.19); // 실수형

        // 문자 형태의 값
        System.out.println('A');
        // System.out.printf(''); // 빈 값을 허용하지 않는다.
        // System.out.println('AB'); // 두 개 이상의 문자를 허용하지 않는다.

        // 문자열 형태의 값
        System.out.println("안녕하세요");
        System.out.println(""); // 빈 값을 허용한다.
        System.out.println("1234");
        System.out.println(1234);

        // 논리 형태의 값
        System.out.println(true);
        System.out.println(false);
    }
}
