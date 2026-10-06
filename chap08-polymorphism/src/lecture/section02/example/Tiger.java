package lecture.section02.example;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("\uD83D\uDC2F 호랑이가 고기를 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("\uD83D\uDC2F 호랑이가 달려갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("\uD83D\uDC2F 호랑이가 울음소리를 냅니다.");
    }

    public void bite() {
        System.out.println("🐯호랑이가 물어 뜯습니다..");
    }

}
