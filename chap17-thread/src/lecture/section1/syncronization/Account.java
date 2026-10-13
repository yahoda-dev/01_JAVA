package lecture.section1.syncronization;

public class Account {
    private int balance = 1000; // 잔고

    public void withdraw(int money)  {
        if(balance >= money){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= money;
            System.out.println(Thread.currentThread().getName() + " | 출금이 " + money +"원 완료되었습니다.");
            System.out.println(Thread.currentThread().getName() + " | 잔액이 " + balance +"원 남았습니다.");
        }
    }
}