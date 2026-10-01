package lecture.section1.logical;

public class Application2 {
    public static void main(String[] args) {
        // && 연산과 || 연산의 우선 순위 비교
        boolean result1 = true || false && false;
        System.out.println("&&이 먼저 실행될 경우: " + result1);
        result1 = (true || false) && false;
        System.out.println("||이 먼저 실행될 경우: " + result1);

        // 아래 변수에 담긴 값이 알파벳인지 판별하는 코드를 작성하세요
        char alphabet = 'f';
        boolean answer; // 결과 값
        char minAlpha = 'A';
        char maxAlpha = 'z';
        int minValue = (int)minAlpha;
        int maxValue = (int)maxAlpha;
        answer = (alphabet >= minValue)
                && (alphabet <= maxValue);
        System.out.println("Is answer Alphabet?: " + answer);
    }
}