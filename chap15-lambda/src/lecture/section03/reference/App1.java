package lecture.section03.reference;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App1 {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");


        subjects.stream().map((str) -> {
            return str.toUpperCase();
        }).forEach(System.out::println);

        subjects.forEach(Example::printName);

    }
}
