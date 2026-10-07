package lecture.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class App5 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
