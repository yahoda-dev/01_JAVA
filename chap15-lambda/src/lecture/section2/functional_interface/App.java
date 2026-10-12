package lecture.section2.functional_interface;

import java.time.LocalDateTime;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        System.out.println(binaryOperator.apply(4, 6));


        Runnable runnable = () -> {
            System.out.println("실행");
        };

        runnable.run();


        Consumer consumer = (str) -> {
            System.out.println(str);
        };
        consumer.accept("Hello");

        Supplier<LocalDateTime> supplier = () -> {
            return LocalDateTime.now();
        };
        System.out.println(supplier.get());

        Function<String, Integer> function = (str) -> Integer.parseInt(str);
        System.out.println(function.apply("5"));

        Predicate<Integer> predicate = (num) -> {
            if (num > 0) return false;
            else return true;
        };
        System.out.println(predicate.test(-1));
    }
}
