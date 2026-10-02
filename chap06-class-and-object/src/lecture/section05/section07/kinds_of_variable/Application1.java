package lecture.section05.section07.kinds_of_variable;

public class Application1 {
    private int gNum;
    private static int staticNum;

    public void testMethod(int arg /*매개변수도 지역 변수의 특성을 갖는다*/) {
        int localNumber; // 지역 변수: 메서드 내부에서만 사용되는 변수
    }

    public void test() {
        // System.out.println(localNumber); // ⚠️ Compile Error!
        System.out.println(gNum);           // 전역 변수는 호출이 된다
        System.out.println(staticNum);      // 스태틱 변수도 호출이 된다
    }

    public static void main(String[] args) {
        //System.out.println(gNum);         // ️️⚠️ static 변수 안에선 아직 생성되지 않은 일반 변수 호출이 불가능하다
        System.out.println(staticNum);      // 스태틱 변수도 호출이 된다
    }










}
