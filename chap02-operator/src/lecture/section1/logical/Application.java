package lecture.section1.logical;

public class Application {
    public static void main(String[] args) {
        boolean _true = true;
        boolean _false = false;

        // && (AND 연산): 두 조건 모두 true인 경우에만 true
        System.out.println("True와 False의 AND 연산: " + (_true && _false));    // result: false
        System.out.println("True와 True의 AND 연산: " + (_true && _true));      // result: true
        System.out.println("False와 False의 AND 연산: " + (_false && _false));  // result: false

        // || (OR 연산): 두 조건 중 하나라도 true이면 true
        System.out.println("True와 False의 OR 연산: " + (_true || _false));     // result: true
        System.out.println("True와 True의 OR 연산: " + (_true || _true));       // result: true
        System.out.println("False와 False의 OR 연산: " + (_false || _false));   // result: false
        System.out.println("=======================================");

        // 성인이면서 티켓을 소유하고 있는가?
        int age = 20;
        boolean hasTicket = true;
        boolean result;

        result = (age > 19) && hasTicket;
        System.out.println("성인이면서 티켓을 소유하고 있는가?: " + result);
        System.out.println("=======================================");
        // 평균 80점 이상이며 출석률이 90% 이상이고 징계 이력이 없어야 장학금 대상이다.
        // 아래의 조건의 학생은 장학금 대상인가?
        int avgScore = 88;
        int attendanceRate = 95;
        boolean hasRecord = false;

        result = (avgScore >= 80)
                && (attendanceRate >= 90)
                && !hasRecord;

        System.out.println("아래의 조건의 학생은 장학금 대상인가?: " + result);
    }
}
