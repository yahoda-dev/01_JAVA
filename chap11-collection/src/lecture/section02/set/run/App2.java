package lecture.section02.set.run;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App2 {
    public static void main(String[] args) {
        TreeSet<Integer> tSet = new TreeSet<>();

        tSet.add(12);
        tSet.add(23);
        tSet.add(44);
        tSet.add(1);
        tSet.add(3434);
        tSet.add(9);
        System.out.println(tSet);


        LinkedHashSet<String> hSet = new LinkedHashSet<>();

        hSet.add("java");
        hSet.add("oracle");
        hSet.add("jdbc");
        hSet.add("html");
        hSet.add("css");
    }
}
