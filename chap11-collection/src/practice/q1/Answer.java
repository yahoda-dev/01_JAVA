package practice.q1;

import java.util.ArrayList;
import java.util.Comparator;

public class Answer {
    /* Q1. ArrayList를 생성하고, 요소를 추가하고, 오름차순으로 정렬하세요.
     *
     * 복습 포인트:
     * - ArrayList의 사용 목적에 대해 이해할 수 있다.
     * - ArrayList의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
     * - Collections.sort() 메소드를 이용하여 오름차순 정렬을 할 수 있다.
     *
     * 조건:
     * - ArrayList에 5, 3, 8, 1, 2를 추가
     * - 오름차순으로 정렬하여 출력
     *
     * 출력 예시:
     * 정렬된 리스트: [1, 2, 3, 5, 8]
     * */

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(1);
        arr.add(2);

        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = 0;
                // todo: 같은 경우도 필요하면 추가할 것
                result = o1 > o2 ? 1: -1;
                return result;
            }
        });

        System.out.println(arr);
    }
}
