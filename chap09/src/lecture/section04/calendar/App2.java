package lecture.section04.calendar;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 10, 7);
        LocalTime time = LocalTime.of(12, 11, 59);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        ZonedDateTime seoulTime = dateTime.atZone(ZoneId.of("Asia/Seoul"));

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(seoulTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek());

        String today = "2026/10/07";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate customDate = LocalDate.parse(today, formatter);
        System.out.println(customDate);

        DateTimeFormatter output = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm");
        LocalDateTime outputExample = LocalDateTime.now();
        System.out.println("===============================");
        System.out.println(outputExample);
        System.out.println(outputExample.format(output));
    }
}
