package Polymorphism.ex.ex1;

public class Car {
    Tire frontLeftTire = new Tire("frontLeftTire");
    Tire frontRighTire = new Tire("frontRightTire");
    Tire backLeftTire = new Tire("backLeftTire");
    Tire backRightTire = new Tire("backRightTire");

    public Car() {
    }

    public void run() {
        if (!frontLeftTire.roll()) {
            frontLeftTire = new HankokTire("frontLeftTire");
        }
        if (!frontRighTire.roll()) {
            frontRighTire = new HankokTire("frontRightTire");
        }
        if (!backLeftTire.roll()) {
            backLeftTire = new KumhoTire("backLeftTire");
        }
        if (!backRightTire.roll()) {
            backRightTire = new KumhoTire("backRightTire");
        }
    }

}
