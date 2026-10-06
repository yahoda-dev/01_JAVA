package lecture.section02.abstract_class;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;

    Product() {
    }

    public void nonStaticMethod() {
        System.out.println("Product의 nonStaticMethod 호출함");
    }

    public static void staticMethod() {
        System.out.println("Product의 staticMethod 호출함");
    }

    // 추상 메서드
    public abstract void abstMethod();
}