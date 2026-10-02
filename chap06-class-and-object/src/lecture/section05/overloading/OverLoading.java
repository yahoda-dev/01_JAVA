package lecture.section05.overloading;

public class OverLoading {

    public void test() {

    }
                /*  ↓ 메서드 시그니처 */
    public void test(int i) { }       // 메서드 시그니처가 달라야 오버로딩이 가능
    public void test(float f) { }
    public void test(int i, String str) { }


}
