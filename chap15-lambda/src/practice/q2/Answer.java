package practice.q2;


import java.util.ArrayList;
import java.util.function.Supplier;

/* Q2. 생성자 참조(`클래스::new`) 를 활용해 ArrayList 인스턴스를 생성하세요.
 *
 *  복습 포인트:
 *  - 생성자 참조의 개념을 이해하고 사용할 수 있다.
 *  - `클래스::new` 구문을 활용할 수 있다.
 *
 *  조건:
 *   ① Supplier<ArrayList<String>> listSupplier = ArrayList::new;
 *      → 호출할 때마다 새로운 빈 ArrayList<String> 을 만들어 반환한다.
 *
 *   ② listSupplier.get() 으로 두 개의 리스트를 만들어 각각 "A", "B" 와 "X", "Y" 를 추가한 뒤
 *      두 리스트를 출력한다.
 *
 *   ③ 두 리스트가 서로 다른 인스턴스인지 == 로 비교해 결과를 출력한다.
 *
 * -- 출력 예시 --
 * list1 : [A, B]
 * list2 : [X, Y]
 * list1 == list2 : false
 * */
public class Answer {
    public static void main(String[] args) {
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;


        ArrayList<String> arr1 = listSupplier.get();
        ArrayList<String> arr2 = listSupplier.get();

        arr1.add("A");
        arr1.add("B");
        arr2.add("X");
        arr2.add("Y");

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);



    }
}
