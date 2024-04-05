package quiz.quiz7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class q2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new CoffeeOrder("에스프레소",2));
        executorService.submit(new CoffeeOrder("아메리카노",3));
        executorService.submit(new CoffeeOrder("카푸치노",5));
        executorService.submit(new CoffeeOrder("라떼",4));


        executorService.shutdown();

    }
}
