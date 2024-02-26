package Polymorphism.ex.ex2;

public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        car.move();
        Bicycle bicycle = new Bicycle();
        bicycle.move();
        Train train = new Train();
        train.move();
    }
}
