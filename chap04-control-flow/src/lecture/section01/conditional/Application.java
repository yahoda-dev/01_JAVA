package lecture.section01.conditional;


import java.util.Scanner;

// Container 용도
public class Application {
    public static void main(String[] args) {
//        A_if aIf = new A_if(new Scanner(System.in));
//        aIf.testSimpleIf();

//        B_if_elseif bIf = new B_if_elseif(new Scanner(System.in));
//        bIf.testSimpleIf();

        C_switch cSwitch = new C_switch();
        cSwitch.calculatorWithSwitch2();
    }
}