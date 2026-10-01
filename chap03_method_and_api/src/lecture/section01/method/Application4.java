package lecture.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Application4 app4 = new Application4();
        System.out.println(app4.sayHello());
    }



    private void testMethod() {
        System.out.println("테스트 동작 확인 1");
    }

    private String sayHello() {
        return "Hello, World!";
    }
}