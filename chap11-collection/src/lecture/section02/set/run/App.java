package lecture.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();



        hSet.add("java");
        hSet.add("oracle");
        hSet.add("jdbc");
        hSet.add("html");
        hSet.add("css");

        System.out.println(hSet); // 출력이 add한 순서가 보장되지 않음
        System.out.println(hSet.size());


        // 배열로 변환이 가능하여 하나씩 출력이 가능함
        Object[] arr = hSet.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        Iterator<String> iter = hSet.iterator();

        while(iter.hasNext()) {
            System.out.println("iter.next(): " + iter.next());
        }
    }
}