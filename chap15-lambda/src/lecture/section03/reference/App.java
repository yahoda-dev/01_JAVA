package lecture.section03.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "유관순", "이순신");

        Consumer<String> consumer = (str) -> System.out.println(str);

        names.forEach(System.out::println);

    }
}
