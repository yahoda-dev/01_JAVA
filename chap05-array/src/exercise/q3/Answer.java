package exercise.q3;


import java.util.Arrays;

/* Q3. 배열의 얕은 복사(shallow copy)와 깊은 복사(deep copy) 의 차이를 직접 비교하세요.
 *
 *  복습 포인트:
 *  - 얕은복사와 깊은복사의 개념을 이해할 수 있다.
 *  - 깊은복사의 방법을 숙지하고 적용할 수 있다.
 *
 *  조건:
 *   ① int[] origin = {1, 2, 3}; 을 준비한다.
 *
 *   ② [얕은 복사] int[] shallow = origin; 으로 같은 배열을 가리키게 한 뒤,
 *      shallow[0] = 99; 로 값을 바꾼다.
 *      origin[0] 도 함께 바뀌었는지 확인하기 위해 origin 을 출력한다.
 *
 *   ③ [깊은 복사] int[] deep = new int[origin.length];
 *      반복문으로 origin 의 각 요소를 deep 으로 복사한 뒤, deep[0] = 0; 으로 값을 바꾼다.
 *      origin 이 영향받지 않았음을 확인하기 위해 origin 을 다시 출력한다.
 *
 * -- 출력 예시 --
 * [얕은 복사] origin : [99, 2, 3]
 * [깊은 복사] origin : [99, 2, 3]
 * [깊은 복사] deep : [0, 2, 3]
 * */
public class Answer {
    public static void main(String[] args) {
        int[] origin = {1, 2, 3};
        int[] shallow = origin;
        shallow[0] = 99;
        System.out.println("얕은 복사 origin" + Arrays.toString(origin));

        int[] deep = new int[origin.length];

        for (int i = 0 ; i < deep.length; i++) {
            deep[i] = origin[i];
        }
        deep[0] = 0;
        System.out.println("깊은 복사 origin" + Arrays.toString(origin));
        System.out.println("깊은 복사 deep" + Arrays.toString(deep));

    }
}
