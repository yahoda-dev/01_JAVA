package lecture.section03.example;

public class BankPaymentProcessor implements PaymentProcessor{
    @Override
    public boolean pay(int amount) {
        System.out.println("계좌 이체로 " + amount + "원을 결제합니다.");
        return true;
    }
}
