package access_modifier;

public class Access2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.turnOn();
        car.setSpeed(119);
        car.speedUp();
        car.speedDown();
        System.out.println("현재속도: " + car.getSpeed() + "km");
        car.tuneOff();
        System.out.println("현재속도: " + car.getSpeed() + "km");

    }
}
