package nested.ex.ex3;

public class Car {
    class Tire {
        String name;
        int duration;

        public Tire(String name, int duration) {
            this.name = name;
            this.duration = duration;
        }

        void run() {
            System.out.printf("타이어가 굴러갑니다. %s의 타이어 내구도는 %d 입니다.\n", name, duration);
        }
    }
    static class Engine {
        static void tureOn() {
            System.out.println("엔진이 켜졌습니다.");
        }

        static void turnOff() {
            System.out.println("엔진이 꺼졌습니다.");
        }
    }
}
