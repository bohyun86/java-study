package nested.ex.ex3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Tire tire = car.new Tire("한국타이어",25);

        Car.Engine.tureOn();
        Car.Engine.turnOff();

        tire.run();
    }
}
