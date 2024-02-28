package Polymorphism.interface0.car.poly;

// 운전자는 Avante를 소유하고, 운전을 할 수 있다.
public class Driver {
    // 필드
    Run run;

    public Driver(Run run) {
        this.run = run;
    }

    public void setCar(Run run) {
        this.run = run;
    }

    public void drive() {
        run.onEngine();
        run.pressAccel();
        run.pressBreak();
        run.offEngine();
    }
}
