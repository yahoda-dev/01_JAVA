package lecture.section1.comparison;

public class Application {
    public static void main(String[] args) {
        /*
        비교 연산자
        - 두 값을 비교하여 boolean 값을 반환한다.
        == : 같은지 / != : 다른지 / < : 작은지 / > : 큰지
        - 비교 연산자는 좌항을 기준으로 우항이 같은지 비교한다.
        */

        int x = 10, y =20;
        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y : " + (x >= y));
        System.out.println("x <= y : " + (x <= y));

    }
}
