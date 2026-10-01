package lecture.section1.increment;

public class Application {
    public static void main(String[] args) {
        /*
        증감연산자
        - 변수의 값을 1 증가 시키거나 1 감소 시키는 연산자
        */

        int num = 20;
        System.out.println("num = " + num);

        // 후위 연산자: 기존 값을 먼저 사용하고 변수의 값을 증감시킨다.
        num++;
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        // 전위 연산자: 값을 먼저 증감시키고 증감된 값을 사용한다.
        ++num;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);


        int firstNum = 20;
        int postResult = firstNum++ * 3;
        System.out.println("firstNum = " + firstNum);    // result = 21
        System.out.println("postResult: " + postResult); // result = 60

        int lastNum = 20;
        int result = ++lastNum * 3;
        System.out.println("lastNum = " + lastNum); // result = 21;
        System.out.println("result = " + result);   // result = 63;
    }
}
