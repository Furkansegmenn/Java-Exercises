package furkan.car;

final public class Car {
    String make;
    int year = 2018;
    String model= "Accent Blue";
    int distances;
    int speed;

    public Car() {
    }

    void accelarate (int newspeed){
        speed= speed+ newspeed;
    }
}
