package lecture.section03.interface_implements;

public class Product implements InterProduct, TestInterface{
    @Override
    public void testMethod() {
        System.out.println("Product 클래스에서 구현한 testMethod");
    }

    @Override
    public void nonStaticMethod() {

    }

    @Override
    public void defaultMethod() {
        InterProduct.super.defaultMethod();
    }
}
