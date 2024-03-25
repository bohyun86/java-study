package thread.ex;

public class Ex4 {
    public static void main(String[] args) {
        ItemShop itemShop = new ItemShop();

        Thread player1 = new Thread(() -> itemShop.buyItem("희동이"));
        Thread player2 = new Thread(() -> itemShop.buyItem("둘리"));
        Thread player3 = new Thread(() -> itemShop.buyItem("마이콜"));

        player1.start();
        player2.start();
        player3.start();
    }

    static class ItemShop {
        private boolean itemAvailable = true;

        public synchronized void buyItem(String name) {
            if (itemAvailable) {
                System.out.printf("플레이어 %s가 아이템을 성공적으로 구매했습니다.\n", name);
                itemAvailable = false;
            } else {
                System.out.printf("플레이어 %s의 구매 시도 실패: 아이템이 이미 판매되었습니다.\n", name);
            }
        }

    }
}
