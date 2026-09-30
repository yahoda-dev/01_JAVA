package lecture.section04.typecasting;

public class Application2 {
    public static void main(String[] args) {
        // 강제 형변환

        long lNum = 3_000_000_000L;
        System.out.println(lNum);
        int iNum = (int) lNum; // 강제 형변환. 단, 데이터 소실 가능
        System.out.println(iNum);

        /* Tip!
        `soutv`를 입력 후 TAB을 누르면 Scope 내 변수가 자동으로 추가된다.(선택 가능)
        * */

        int num1 = 65;
        char c1 = (char)num1; // 정수형을 문자로 바꿀 때도 강제 형변환이 필요하다.
        System.out.println(c1);

        // 실무에서 (그나마) 유효하게 사용되는 형변환 예시
        double  height = 179.9;
        int decimalHeight = (int) height;
        System.out.println(decimalHeight + "cm");
    }
}
