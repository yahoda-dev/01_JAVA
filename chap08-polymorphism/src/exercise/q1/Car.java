package exercise.q1;

public class Car extends Vehicle{
    private String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void move() {
        System.out.println("자동차가 도로를 달립니다.");
    }
}
