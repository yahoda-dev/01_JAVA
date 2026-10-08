package lecture.section01.exception;

public class App2 {
    public static void main(String[] args) throws Exception {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(10000, 9999);
        } catch (Exception e){
            System.out.println("예외가 발생했습니다.");
        }
    }
}