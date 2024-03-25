package thread.ex;

public class Ex6 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Thread customer = new Thread(() -> {
            try {
                while (true) {
                    restaurant.placeOrder();
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread chef = new Thread(() -> {
            try {
                while (true) {
                    restaurant.prepareOrder();
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        customer.start();
        chef.start();
    }

    static class Restaurant {
        private boolean isOrderPlaced = false;

        public synchronized void placeOrder() throws InterruptedException {
            if (isOrderPlaced) {
                wait();
            }
            System.out.println("고객: 주문을 합니다.");
            isOrderPlaced = true;
            notifyAll();
        }

        public synchronized void prepareOrder() throws InterruptedException {
            if (!isOrderPlaced) {
                wait();
            }
            System.out.println("요리사: 주문을 받아 음식을 준비합니다.");
            Thread.sleep(2000);
            System.out.println("요리사: 음식 준비 완료, 서빙합니다.");
            notifyAll();
            isOrderPlaced = false;
        }
    }
}
