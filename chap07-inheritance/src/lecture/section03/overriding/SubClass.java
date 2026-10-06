package lecture.section03.overriding;

public class SubClass extends SuperClass {

    @Override
    public void method(int num) {

    }

    /* `private` 메서드는 오버라이딩 불가
    @Override
    private void privateMethod() { }
     */

    /* `final` 메서드는 오버라이딩 불가
    @Override
    private void finalMethod() { }
     */


    @Override // protected는 overriding 가능
    protected void protectedMethod() { super.protectedMethod(); }
    // public으로 변환도 가능(더 넓은 공개 범위의 접근 제어자로의 변경은 가능하다)

}