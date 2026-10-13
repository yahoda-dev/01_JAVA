package lecture.section1.syncronization;

public class App {
    public static void main(String[] args) {
        Account account = new Account();
        SafeAccount sAccount = new SafeAccount();

        Thread t1 = new Thread(() -> {
            account.withdraw(100);

        }, "일꾼1");

        Thread t2 = new Thread(() -> {
            account.withdraw(100);
        }, "일꾼2");

        Thread t3 = new Thread(() -> {
            sAccount.withdraw(100);
        }, "일꾼3");

        Thread t4 = new Thread(() -> {
            sAccount.withdraw(100);
        }, "일꾼4");

//        t1.start();
//        t2.start();

        t3.start();
        t4.start();
    }
}