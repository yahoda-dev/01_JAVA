package lecture.section01.array;

public class Application4 {
    public static void main(String[] args) {
        /*

         */
        Application4 object = new Application4();

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        System.out.println("당신이 뽑은 카드는 %s %s 카드 입니다.".formatted(
                shapes[object.getRandomDecimal(shapes.length)],
                cardNumbers[object.getRandomDecimal(cardNumbers.length)]
        ));
    }

    private int getRandomDecimal(int range) {
        int value = Math.abs((int)(Math.random() * range));
        System.out.println("called getRandomDecimal: " + value);
        return value;
    }
}