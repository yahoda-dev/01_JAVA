package lecture.section1.logical;

public class Application3 {
    public static void main(String[] args) {
        /*
        단락 평가란?
        &&와 ||에서 앞의 조건만으로 전체 결과가 결정될 경우 뒤의 조건을 수행하지 않는다는 규칙
        */

        int num = 10;
        int zero = 0;
        // tip: 모든 숫자는 0으로 나눌 수 없다.

        /*
        int result = num / zero;
        System.out.println("result: " + result);
         */

        boolean result;
        // Compile Error를 발생시키는 연산을 포함시켜도 단락 평가로 인해 해당 연산을 수행하지 않고, false를 반환한다.
        result = zero != 0 && ((num / zero) > 2);
        System.out.println("result: " + result);
        /* 조건문의 순서를 변경할 경우 컴파일 에러!!
        result = ((num / zero) > 2) && zero != 0;
        System.out.println("result: " + result);
         */

        int count = 10;
        // OR 연산에서도 선행 조건이 참일 경우 후행 조건에 대한 검토를 진행하지 않고 true를 반환한다.
        result = true || (++count > 0);
        System.out.println("count: " + count); // count에 ++가 적용되지 않았음을 확인할 수 있다.
        System.out.println("result: " + result);
    }
}