package Furkan.Car;

public class CarTest {
      public static void main(String[] args){
         final Car car1=new Car();

          car1.make= "Hyundai";
          car1.year=2018;
          car1.speed= 60;
          car1.distances=100;

          System.out.println("Speed Of Car: "+ car1.speed + "kmh");
          System.out.println("Distances: "+ car1.distances+"km");

          System.out.println("**************");

          car1.accelarate(50);
          System.out.println("Speed Of Car: "+ car1.speed + "kmh");
      }
}
