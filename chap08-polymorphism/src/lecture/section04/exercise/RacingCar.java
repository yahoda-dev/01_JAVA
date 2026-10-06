package lecture.section04.exercise;

public class RacingCar extends Car {
    @Override
    public void go() {
        System.out.println("레이싱카 출발");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카 정지");
    }
}
