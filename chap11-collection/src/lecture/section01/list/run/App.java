package lecture.section01.list.run;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList arrs = new ArrayList();
        List arrList = new ArrayList();

        arrs.add("apple");
        arrs.add(123);
        arrs.add(45.53);
        arrs.add(LocalDateTime.now());

        System.out.println(arrs.toString());


    }

}