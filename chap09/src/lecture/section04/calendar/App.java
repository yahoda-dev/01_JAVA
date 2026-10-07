package lecture.section04.calendar;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.println(now);
        System.out.println(now.getTime());

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "년");
        System.out.println((month + 1) + "월");
        System.out.println(day + "일");

    }
}
