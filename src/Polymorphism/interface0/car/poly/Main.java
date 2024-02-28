package Polymorphism.interface0.car.poly;

public class Main {
    public static void main(String[] args) {
        Avante avante = new Avante();
        Sonata sonata = new Sonata();

        Driver driver = new Driver(avante);
        driver.drive();
        driver.setCar(sonata);
        driver.drive();
    }
}
