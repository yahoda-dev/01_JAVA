package lecture.section3;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        long count = IntStream.range(1, 10).count();
        System.out.println("count = " + count);


        OptionalDouble od = IntStream.range(1, 10).average();
        System.out.println("od = " + od);
    }
}
