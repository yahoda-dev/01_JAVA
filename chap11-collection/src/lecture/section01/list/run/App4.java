package lecture.section01.list.run;

import java.util.Stack;

public class App4 {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();



        intStack.push(100);
        intStack.push(200);
        intStack.push(300);
        intStack.push(400);

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}
