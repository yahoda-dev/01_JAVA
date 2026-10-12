package lecture.section2;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class App2 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0, 10);
        IntStream intStream2 = IntStream.range(0, 10);

        intStream.filter((i) -> (i % 2) == 0)
                .map(i -> i * 6)
                .forEach(System.out::println);

    }
}
