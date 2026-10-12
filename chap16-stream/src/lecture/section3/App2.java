package lecture.section3;

import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("java", "spring", "springboot");

        System.out.println(strList.stream().anyMatch((str) -> str.equals("sibring")));
    }
}
