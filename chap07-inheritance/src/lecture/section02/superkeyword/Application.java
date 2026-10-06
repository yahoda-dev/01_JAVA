package lecture.section02.superkeyword;

public class Application {
    public static void main(String[] args) {
        System.out.println("=======1. 생략된 supper() =========");
        new Computer(); // Computer 기본 생성자 호출

        System.out.println("=======2. 매개 변수가 있는 supper(...) =========");
        Computer computer = new Computer(
                "S-01234", "삼성", "갤럭시폴드6", 2398000, new java.util.Date(),
                "퀄컴 스냅드래곤", 512, 12, "안드로이드"
        );

        System.out.println("=======3. 부모 메서드 호출 =========");
        System.out.println(computer.toString());

    }
}