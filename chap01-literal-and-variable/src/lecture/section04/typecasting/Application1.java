package lecture.section04.typecasting;

public class Application1 {
    public static void main(String[] args) {
        // 자동 형변환
        // 값의 범위를 넓히는 변환은 컴파일러가 자동으로 처리함
        // 서로 다른 숫자형을 연산할 때, 더 큰 자료형으로 변환되는 경우가 예시

        byte bNum = 1;
        short sNum = bNum;
        int iNum = bNum;

        int num1 = 10;
        long num2 = 20;
        // int result1 = num1 + num2; // Compile Error-!!
        // 동작시키려면? 타입캐스팅 -->  result1 = (int) (num1  + num2);

        char c1 = 'a';
        int ic1 = c1;
        System.out.println(ic1);
    }
}
