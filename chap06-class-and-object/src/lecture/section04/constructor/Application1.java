package lecture.section04.constructor;

public class Application1 {
    public static void main(String[] args) {
        User user = new User();
        //
        User user2 = new User("user01", "pass01", "홍길동");

        System.out.println(user2);
    }
}
