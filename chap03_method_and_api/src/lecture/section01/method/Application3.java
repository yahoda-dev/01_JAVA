package lecture.section01.method;

public class Application3 {
    /*
    매개변수(parameter) & 인자(argument)
    */
    public static void main(String[] args) {
        Application3 app3 = new Application3();
        app3.printAge(32);
        app3.printUserInfo("김지원", 28, '남');
    }


    public void printAge(int age/*매개변수*/) {
        System.out.println("나이는 %d살 입니다.".formatted(age));
    }

    private void printUserInfo(String name, int age, char gender) {
        System.out.println("이름:%s\n나이:%d\n성별:%s".formatted(name, age, gender));
    }
}