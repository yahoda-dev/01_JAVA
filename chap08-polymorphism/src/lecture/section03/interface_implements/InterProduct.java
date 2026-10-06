package lecture.section03.interface_implements;

public interface InterProduct {
    // 상수 필드와 추상 메서드만 가질 수 있다.
    public static final int MAX_NUM = 100;
    void nonStaticMethod();
    static void staticmethod() {
        System.out.println("Interface는 Static 메서드를 가질 수 있다.");
    }
    default void defaultMethod() {
        System.out.println("Interface는 default 메서드를 가질 수 있다.");
    }
}
