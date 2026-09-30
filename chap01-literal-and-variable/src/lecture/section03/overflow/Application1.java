package lecture.section03.overflow;

public class Application1 {
    public static void main(String[] args) {
        // 자료형마다 표현할 수 있는 범위를 넘어설 경우

        byte bNum1 = 127;
        // byte bNum2 = 128; // Compile Error-!!
        System.out.println("증가 전: " + bNum1);
        System.out.println("증가 후 : " + ++bNum1);
        // result: -128
        // Compile, Runtime Error가 발생하지 않으니 주의할 것


        int num1 = 1000000;
        int num2 = 700000;
        System.out.println(num1 * num2);

        long lNum = (long)num1 * (long)num2; // 타입 캐스팅을 해주지 않을 경우 int 자료형 간 연산이라 lNum에는 int 값이 저장된다.
        System.out.println(lNum);
    }
}
