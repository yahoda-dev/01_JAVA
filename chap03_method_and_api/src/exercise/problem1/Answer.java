package exercise.problem1;


//문제 1. 온라인 주문 출고 처리*
//problem01 패키지의 Answer 클래스 main 메서드에서 "출고 처리 시작"을 출력한다.
//Answer 타입의 orderManager 객체를 생성한다.
//매개변수와 반환값이 없는 non-static 메서드 verifyPayment, packOrder,
//        handOverToCourier를 작성하고, 각 메서드에서 담당 업무의 완료 메시지를 출력한다.
//orderManager 객체로 세 메서드를 업무 순서대로 호출한다.
//모든 메서드의 호출이 끝나면 main 메서드에서 "출고 처리 종료"를 출력한다.*
//실행 결과
//출고 처리 시작
//결제를 확인했습니다.
//상품 포장을 완료했습니다.
//택배사에 상품을 인계했습니다.
//출고 처리 종료

public class Answer {
    public static void main(String[] args) {
        Answer orderManager = new Answer();

        System.out.println("출고 처리 시작");
        orderManager.verifyPayment();
        orderManager.packOrder();
        orderManager.handOverToCourier();


        System.out.println("출고 처리 종료");
    }

    private void verifyPayment() {
        System.out.println("결제를 확인했습니다.");
    }

    private void packOrder() {
        System.out.println("상품 포장을 완료했습니다.");
    }

    private void handOverToCourier() {
        System.out.println("택배사에 상품을 인계했습니다.");
    }
}
