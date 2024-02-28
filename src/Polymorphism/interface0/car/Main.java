package Polymorphism.interface0.car;

public class Main {
    public static void main(String[] args) {
        Avante avante = new Avante();
        Driver driver = new Driver();

        driver.setAvante(avante);
        driver.drive();



    }
}
