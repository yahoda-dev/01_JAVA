package lecture.section01.method;

public class Application1 {
    // Main Method
    public static void main(String[] args) {
    /*
    함수와 메서드 차이
    - 함수: 독립적으로 실행되는 코드 묶음
    - 메서드 : 클래스나 객체에 포함되어 동작하는 함수
    */
        System.out.println("called Main Method.");
        Application1 app = new Application1();
        app.methodA();
        app.methodB();
        app.methodC();
        System.out.println("return Main Method");
    }



    public void methodA() {
        System.out.println("called methodA()...");
    }

    public void methodB() {
        System.out.println("called methodB()...");
    }

    public void methodC() {
        System.out.println("called methodC()...");
    }
}