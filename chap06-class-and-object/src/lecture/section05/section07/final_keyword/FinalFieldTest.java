package lecture.section05.section07.final_keyword;

public class FinalFieldTest {
    /*
    final : 변경 불가 키워드
    - 지역 변수 -> 초기화 후 값 변경이 불가능하다
    - 매개 변수 -> 호출 시 전달한 인자를 변경 불가
    - 전역 변수 -> 인스턴스 생성 후 초기화 이후에 변경 불가
    */

    private final int NON_STATIC_NUM = 1;
    private final String NON_STATIC_NAME;
    //private static final double STATIC_DOUBLE;

    public FinalFieldTest(String nonStaticName) {
        NON_STATIC_NAME = nonStaticName;
    }

    // 초기화 블럭

//    public FinalFieldTest(double staticDouble) {
//        STATIC_DOUBLE = staticDouble;
//    }
}
