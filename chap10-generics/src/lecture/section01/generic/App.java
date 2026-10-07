package lecture.section01.generic;

public class App {
    public static void main(String[] args) {
        GenericTest<Integer> gt1 = new GenericTest<>(1);

        System.out.println(gt1.getValue());
    }
}
