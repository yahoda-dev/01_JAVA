package exercise;

/*
 * 문제 3. 상수를 이용한 상품 금액 계산
 *
 * 상품명, 상품 단가, 구매 수량을 상수로 선언한다.
 * - 상품명: 키보드
 * - 상품 단가: 12000
 * - 구매 수량: 3
 * 단가와 수량을 곱한 결과를 totalPrice 변수에 저장하여 출력한다.
 * 상수 이름은 대문자와 밑줄을 사용한다.
 *
 * 실행 결과
 * 상품명 : 키보드
 * 단가 : 12000원
 * 수량 : 3개
 * 총 금액 : 36000원
 */
public class Answer3 {
    public static void main(String[] args) {
        final String PRODUCT_NAME = "키보드";
        final int PRODUCT_PRICE = 12000;
        final int BUY_AMOUNT = 3;

        int totalPrice = 0;
        totalPrice = PRODUCT_PRICE * BUY_AMOUNT;

        StringBuilder builder = new StringBuilder()
                .append("상품명 : " + PRODUCT_NAME).append("\n")
                .append("단가 : " + PRODUCT_PRICE + "원").append("\n")
                .append("수량 : " + BUY_AMOUNT + "개").append("\n")
                .append("총 금액 : " + totalPrice + "원").append("\n");

        System.out.println(builder);

    }
}
