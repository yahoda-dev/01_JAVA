package lecture.section02.package_and_import;

import lecture.section01.method.Calculator;

public class Application2 {
    /*
    패키지
    - 서로 관련있는 클래스 등을 모아 하나의 그룹으로 구성하는 것을 의미함.
    */


    public static void main(String[] args) {
        System.out.println(Calculator.sum(9, 9));

        Calculator calculator = new Calculator();
    }
}