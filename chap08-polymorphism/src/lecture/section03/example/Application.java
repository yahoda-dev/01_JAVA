package lecture.section03.example;

public class Application {
    public static void main(String[] args) {
        OrderService orderService;

        orderService = new OrderService(new BankPaymentProcessor());
        orderService.checkout(10000);

        orderService = new OrderService(new CreditPaymentProcessor());
        orderService.checkout(20000  );
    }
}
