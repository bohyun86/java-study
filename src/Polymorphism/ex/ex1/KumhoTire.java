package Polymorphism.ex.ex1;

public class KumhoTire extends Tire {
    public KumhoTire(String location) {
        super(location);
    }

    @Override
    public boolean roll() {
        accumulatedRotation++;
        if (maxRotation != accumulatedRotation) {
            System.out.println("금호타이어가 회전합니다. 수명: " + (maxRotation - accumulatedRotation));
            return true;
        } else {
            System.out.println(location + "금호타이어의 수명이 다했습니다.");
            return false;
        }
    }
}
