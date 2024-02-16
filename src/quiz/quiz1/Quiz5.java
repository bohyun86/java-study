package quiz.quiz1;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {

        ProductOrder order1 = creatOrder("노트북",1000000,2);
        ProductOrder order2 = creatOrder("마우스",15000,3);
        ProductOrder order3 = creatOrder("키보드",50000,1);

        ProductOrder[] orders = {order1, order2, order3};

        printInfo(orders);

    }

    public static ProductOrder creatOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printInfo(ProductOrder[] orders) {
        int totalPay = 0;
        for (ProductOrder order:orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량 :" + order.quantity);
            totalPay += order.price * order.quantity;
        }
        System.out.println("총 결제금액:" + totalPay);
    }
}
