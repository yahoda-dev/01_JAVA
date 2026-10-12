package practice.q1;

public class Answer {
    /* Q1. 제네릭스를 사용하여 여러 타입의 데이터를 저장할 수 있는 클래스를 작성하고, 데이터를 추가하고 출력하세요.
     *
     * 복습 포인트:
     * - 제네릭스를 사용하여 여러 타입의 데이터를 저장할 수 있는 클래스를 작성할 수 있다.
     *
     * 클래스명: MultiBox
     * 필드: 첫 번째 데이터(firstData, 제네릭 타입), 두 번째 데이터(secondData, 제네릭 타입)
     * 메소드: 첫 번째 데이터 추가(setFirstData), 두 번째 데이터 추가(setSecondData), 데이터 출력(printData)
     *
     * MultiBox<String, Integer>와 MultiBox<Double, String> 타입의 인스턴스를 생성하고, 데이터를 추가하고 출력
     *
     * 출력 예시:
     * 첫 번째 데이터: Hello, 두 번째 데이터: 100
     * 첫 번째 데이터: 45.67, 두 번째 데이터: World
     * */

    public static void main(String[] args) {
        MultiBox m1 = new MultiBox<String, Integer>();
        MultiBox m2 = new MultiBox<Double, String>();

        m1.setFirstData("Hello");
        m1.setSecondData(100);

        m2.setFirstData(45.67);
        m2.setSecondData("World");

        System.out.println("""
                첫 번째 데이터: %s, 두 번째 데이터: %d
                첫 번째 데이터: %.2f, 두 번째 데이터: %s
                """.formatted(
                        m1.getFirstData(), m1.getSecondData(), m2.getFirstData(), m2.getSecondData()
        ));

    }
}
