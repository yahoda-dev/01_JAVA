package lecture.section00.review;


// 1주차 내용 복습 클래스
public class Application {
    public static void main(String[] args) {

        Person person = new Person(
                "Kimjiwon",
                28
        );
        //tip: 생성자 `Person()`은 다른 생성자가 없을 때만 컴파일러가 기본적으로 생성해주는 생성자
        person.introduce();

        Person person2 = new Person();
        person2.introduce();
    }
}