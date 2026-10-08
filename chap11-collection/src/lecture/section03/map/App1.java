package lecture.section03.map;

import java.util.Date;
import java.util.HashMap;

public class App1 {
    public static void main(String[] args) {


        HashMap hMap = new HashMap();

        hMap.put("one", new Date());
        hMap.put(12, "red Apple");
        hMap.put(33, 33);

        System.out.println(hMap);
    }
}
