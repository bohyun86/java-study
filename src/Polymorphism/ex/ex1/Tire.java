package Polymorphism.ex.ex1;

public class Tire {
    String location;
    int maxRotation = 5;
    int accumulatedRotation = 0;

    public Tire(String location) {
        this.location = location;
    }

    public boolean roll() {
        accumulatedRotation++;
        if (maxRotation != accumulatedRotation) {
            System.out.println("타이어가 회전합니다. 수명: " + (maxRotation - accumulatedRotation));
            return true;
        } else {
            System.out.println(location + "타이어의 수명이 다했습니다.");
            return false;
        }
    }
}
