package Polymorphism.interface0.car;

// 운전자는 Avante를 소유하고, 운전을 할 수 있다.
public class Driver {
    // 필드
    private Avante avante;

    public Driver() {
    }

    public void setAvante(Avante avante) {
        this.avante = avante;
    }

    public void drive() {
        avante.onEngine();
        avante.pressAccel();
        avante.pressBreak();
        avante.offEngine();
    }
}
