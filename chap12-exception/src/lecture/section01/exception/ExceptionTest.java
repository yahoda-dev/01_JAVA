package lecture.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 있는 돈은 %d원입니다.".formatted(money));

        if(money >= price) {
            System.out.println("상품 구매 가능!");
        } else {
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑하세요 :)");
    }
}
