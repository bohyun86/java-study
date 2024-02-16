package class0.ex;

import java.util.Scanner;

public class Ex5 {
    // 4번 연습문제에서 주문을 입력받아 등록하고
    // 총 결제금액을 만들 수 있도록 수정해주세요.
    /*
    출력예시
    ===
    주문의 개수를 입력하세요:  2
    상품 주문을 입력하세요.
    상품명: 노트북
    가격: 1000000
    수량: 2
    상품 주문을 입력하세요.
    상품명: 마우스
    가격: 50000
    수량: 1

    주문 상품 정보:
    상품명: 노트북, 가격: 1000000원, 수량: 2개
    상품명: 마우스, 가격: 50000원, 수량: 1개
    총 결제 금액: 2050000원
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 주문 수량 입력받기
        System.out.print("주문의 개수를 입력하세요: ");
        int orderNum = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders = new ProductOrder[orderNum];

        for (int i = 0; i < orderNum; i++) {
            // 상품주문 정보 입력받기
            System.out.println("상품주문을 입력하세요.");
            System.out.print("상품명: ");
            String name = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            // 주문정보 저장하기
            ProductOrder order = createOrder(name,price,quantity);
            productOrders[i] = order;
        }

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