package nested.ex.ex5;

public class Anonymous {

    Worker field = new Worker() {
        @Override
        void start() {
            System.out.println("디자인을 합니다.");
        }
    };

    void method1() {
        Worker worker = new Worker() {
            @Override
            void start() {
                System.out.println("개발을 합니다.");
            }
        };
        worker.start();
    }
    void method2(Worker worker) {
        worker.start();
    }


}
