package exercise.q3;

import exercise.q1.Boat;
import exercise.q1.Car;
import exercise.q1.Vehicle;

public class VehicleFactory {

    public static Vehicle create(String type){
        switch (type){
            case "car":
                return new Car("가솔린");
            case "boat":
                return new Boat("FRP");
            default:
                return new Vehicle(0);
        }
    }

    public static void runVehicle(Vehicle v) {
        if(v != null){
            v.move();
        }
    }
}
