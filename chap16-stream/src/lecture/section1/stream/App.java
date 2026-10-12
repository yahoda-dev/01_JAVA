package lecture.section1.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("hello", "world", "stream"));

        //strList.forEach(System.out::println);


        // 이런 것도 할 수 있음
        IntStream intStream = IntStream.range(1, 100);
        //intStream.forEach(System.out::println);

        Stream<String> strStream = Stream.of("java", "html", "mysql");
        Stream<String> strStream2 = Stream.of("jdbc", "js");


        Stream<String> concatStream = Stream.concat(strStream, strStream2);
        concatStream.forEach(System.out::println);
    }
}
