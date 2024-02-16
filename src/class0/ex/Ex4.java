package class0.ex;

public class Ex4 {
    // 3번의 연습문제를 리팩토링 해주세요.
    // createOrder 매소드를 통해 상품주문 객체를 생성해주세요
    // printOrder 매소드를 통해 상품 정보를 출력해주세요.
    // getTotalAmount 메소드를 통해 총 결제 금액을 구해주세요.
    public static void main(String[] args) {

        // 상품주문 객체 생성
        ProductOrder product1 = createOrder("노트북", 1000000, 2);
        ProductOrder product2 = createOrder("마우스", 15000, 3);
        ProductOrder product3 = createOrder("키보드", 50000, 1);

        ProductOrder[] productOrders = {product1, product2, product3};

        // 상품 정보 출력
        for (ProductOrder productOrder:productOrders) {
            printOrder(productOrder);
        }

        // 총 결제 금액 출력
        int total = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 = " + total + "원");

    }

    public static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printOrder(ProductOrder productOrders) {
        System.out.println(
                "상품명: " + productOrders.productName + ", " +
                        "가격: " + productOrders.price + "원, " +
                        "수량: " + productOrders.quantity + "개");
    }

    public static int getTotalAmount(ProductOrder[] productOrders) {
        int toTotalPayment = 0;
        for (ProductOrder productOrder:productOrders) {
            toTotalPayment += productOrder.price * productOrder.quantity;
        }
        return toTotalPayment;
    }

}
