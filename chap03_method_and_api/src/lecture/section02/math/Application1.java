package lecture.section02.math;

public class Application1 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-7));
        System.out.println("최대값은? %d".formatted(Math.max(10, 20)));
        System.out.println("최소값은? %d".formatted(Math.min(10, 20)));
        System.out.println("파이는? %.2f".formatted(Math.PI));

        int random;
        for(int i = 0; i < 10; i++) {
            random = (int) (Math.random() * 10) + 1;
            System.out.println(random);
        }
    }
}
