package furkan.car;

public class CarTest {
    public static void main(String[] args) {
        final Car car = new Car();

        car.make = "Hyundai";
        car.model = "Accent Blue";
        car.year = 2018;
        car.speed = 60;
        car.distances = 100;

        System.out.println("Speed Of Car: " + car.speed + "kmh");
        System.out.println("Distances: " + car.distances + "km");

        System.out.println("**************");

        car.accelarate(50);
        System.out.println("Speed Of Car: " + car.speed + "kmh");
    }
}
