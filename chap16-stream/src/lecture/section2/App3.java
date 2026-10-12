package lecture.section2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App3 {
    public static void main(String[] args) {
        List<Integer> intList = IntStream.of(5, 2, 3, 7, 9, 10)
                .boxed()   // 기본 타입을 참조 타입으로 변경해주는 메서드
                .sorted()
                .collect(Collectors.toList());  // 리스트 타입으로 변경해주는 메서드   `toList()`와 동일함
        System.out.println("intList = " + intList);

        List<String> stringList = Arrays.asList("java", "sql", "mybatis", "jdbc", "spring", "java", "mybatis", "sql", "sql");

        List<String> strList2 = stringList.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .limit(3)
                .toList();

        System.out.println("strList2 = " + strList2);
    }
}
