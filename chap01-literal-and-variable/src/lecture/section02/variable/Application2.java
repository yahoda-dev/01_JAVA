package lecture.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        /*
        변수를 사용하는 방법
         1. 변수를 선언한다.  *선언: 자료형 + 변수명 + 세미 콜론(;)
         2. 변수에 값을 대입한다. (=초기화, 대입)
         3. 변수를 사용한다.
        */

        int age = 28;
        System.out.println(age);

        // 정수형
        byte bNum;
        short sNum;
        int iNum; // 정수형의 기본형
        long lNum;
        lNum = 3_000_000_000L; // int 자료형이 표현 가능한 범위를 초과하는 값을 long 타입 변수에 저장하기 위해서는 접미어 `L`을 붙여야 한다.

        bNum = 127;

        // 실수형
        float fNum;
        double dNum; // 실수형의 기본형
        fNum = 4.0f; // Float 변수에 값을 저장할 때는 접미어 `f`를 명시해주는 것이 좋다.

        char ch; // 문자
        boolean isTrue; // 논리형

        String str; // 문자열(참조 자료형)
    }
}
