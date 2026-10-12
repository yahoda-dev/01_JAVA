package practice.q2;

import java.util.Calendar;

public class Answer {
    /* Q2. 제네릭 클래스를 작성하고, 와일드카드를 사용하여 특정 타입 범위의 데이터를 처리하세요.
     *
     * 복습 포인트:
     * - 와일드카드를 사용하여 인자의 타입 범위를 제한할 수 있다.
     *
     * 클래스명: DataProcessor
     * 필드: 데이터 리스트(dataList, List<? extends Number>)
     * 메소드: 데이터 추가(addData), 데이터 처리(processData)
     *
     * DataProcessor 타입의 인스턴스를 생성하고, 데이터를 추가한 후 데이터 처리 결과를 출력
     *
     * 출력 예시:
     * 데이터 처리 결과: [10, 20.5, 30, 40.7]
     * */

    public static void main(String[] args) {
        Calendar.getInstance();


        DataProcessor dp = new DataProcessor();
        dp.processData();
    }
}