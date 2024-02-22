package static0.inheritance;

public abstract class Car {
    void move() {
        System.out.println("차량이 이동합니다.");
    }

    abstract void charge();

    void pushBreak() {
        System.out.println("브레이크를 밟습니다.");
    }
}
