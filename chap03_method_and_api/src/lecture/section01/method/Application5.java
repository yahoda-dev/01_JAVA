package lecture.section01.method;

public class Application5 {
    public static void main(String[] args) {
        Application5 app5 = new Application5();
        System.out.println(app5.plus(1, 5));
        System.out.println(app5.minus(1, 5));
        System.out.println(app5.multiple(1, 5));
        System.out.println(app5.divide(1, 5));
    }


    private int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    private int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    private int divide(int x, int y) {
        int result = x % y;
        return result;
    }

    private int multiple(int x, int y) {
        int result = x * y;
        return result;
    }
}
