package access_modifier.ex.com.shoppingcart.management;

public class ShoppingCart {
    private int itemCount = 10;
    private Item[] items = new Item[itemCount];

    public void addItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return;
            }
        }
        System.out.println("장바구니가 가득 찼습니다..");
    }

    public void displayItem() {
        int sum = 0;
        System.out.println("장방구니 상품 출력");
        for (int i = 0; i < items.length;i++) {
            if (items[i] != null) {
                System.out.printf("상품명: %s, 합계: %d\n", items[i].getName(), items[i].getPrice() * items[i].getQuantity());
                sum += items[i].getPrice() * items[i].getQuantity();
            } 
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
