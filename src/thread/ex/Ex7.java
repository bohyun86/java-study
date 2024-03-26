package thread.ex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex7 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CoffeeOrder[] coffeeOrders = {new CoffeeOrder("에스프레소", 2)
                , new CoffeeOrder("아메리카노", 3)
                , new CoffeeOrder("카푸치노", 5)
                , new CoffeeOrder("라떼", 4)
                , new CoffeeOrder("유자차", 6)
                , new CoffeeOrder("프라푸치노", 7)
                , new CoffeeOrder("딸기슬러시", 8)};

        for (CoffeeOrder order : coffeeOrders) {
            executorService.submit(order);
        }

        executorService.shutdown();

    }

    static class CoffeeOrder implements Runnable {
        String name;
        int time;

        public CoffeeOrder(String name, int time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "> " + name + "준비 시작.");
            try {
                Thread.sleep(time * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ">" + name + "준비 완료!");
        }
    }
}
