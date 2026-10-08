package lecture.section01.exception;

public class App {
    public static void main(String[] args) throws Exception {
        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(10000, 9999);
    }
}
