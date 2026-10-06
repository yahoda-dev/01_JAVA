package lecture.section04.exercise;

public class Application {
    public static void main(String[] args) {
        // FireCar와 RacingCar는 앞으로 갈 수 있다.(= go())
        // FireCar와 RacingCar는 멈출 수 있다.(= stop())

        Car[] cars = new Car[2];
        cars[0] = new FireCar();
        cars[1] = new RacingCar();

        for (Car car : cars) {
            car.go();
            if(car instanceof Soundable) ((Soundable) car).horn();
            car.stop();
        }
    }
}