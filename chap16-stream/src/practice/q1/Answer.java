package practice.q1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/* Q1. 문자열 배열의 스트림을 생성하고, "a"로 시작하는 단어를 필터링하여 오름차순으로 정렬하세요.
 * - 배열: ["apple", "banana", "apricot", "cherry", "avocado"]
 * - filter()와 sorted()를 사용해 데이터를 처리하세요.
 *
 * -- 출력 예시 --
 * apple
 * apricot
 * avocado
 * */
public class Answer {

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apricot", "cherry", "avocado"};
        Stream<String> stream = Arrays.stream(arr);

        stream.filter(str -> str.startsWith("a"))
                .sorted().forEach(System.out::println);
    }
}
