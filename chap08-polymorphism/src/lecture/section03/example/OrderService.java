package lecture.section03.example;

public class OrderService {
    private final PaymentProcessor paymentProcessor;

    OrderService(PaymentProcessor pp){
        paymentProcessor = pp;
    }

    public void checkout(int amount) {
        System.out.println("주문 결제를 시작합니다.");

        if (paymentProcessor.pay(amount)){
            System.out.println("주문이 완료되었습니다.");
        } else {
            System.out.println("주문이 실패하였습니다.");
        }
    }
}
