package exercise.q1;

public class Vehicle {
    private int maxSpeed;

    public Vehicle() {}

    public Vehicle(int speed) {
        maxSpeed = speed;
    }

    public void move() {
        System.out.println("차량이 이동합니다.");
    }
}
