package lecture.section01.extend;

public class Application {
    public static void main(String[] args) {
        /*
        FireCar car = new FireCar();

        car.run();
        car.soundHorn();
        car.stop();

        car.sprayWater();
         */

        RacingCar car = new RacingCar();
        car.run();
        car.soundHorn();
        car.stop();
    }
}