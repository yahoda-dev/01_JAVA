package lecture.section2;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(0, 10);
        Predicate<Integer> predicate = (i) -> (i % 2) == 0;

        intStream.filter((i) -> (i%2) == 0).forEach(System.out::println);
    }
}
