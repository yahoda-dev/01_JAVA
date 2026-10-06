package lecture.section04.exercise;

public class FireCar extends Car implements Soundable{
    @Override
    public void go() {
        System.out.println("소방차 출발");
    }

    @Override
    public void stop() {
        System.out.println("소방차 정지");
    }

    @Override
    public void horn() {
        System.out.println("빵빵");
    }
}
