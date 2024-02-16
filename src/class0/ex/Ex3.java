package class0.ex;

public class Ex3 {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 품목 수 : ");
        int productNumbers = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders  = new ProductOrder[productNumbers];

        for (int i = 0; i < productOrders.length; i++) {
            productOrders[i] = new ProductOrder();
            productOrders[i].productName = scanner.nextLine();
            productOrders[i].price = scanner.nextInt();
            productOrders[i].quantity = scanner.nextInt();
            scanner.nextLine();
        }
        */

        ProductOrder product1 = new ProductOrder();
        product1.productName = "노트북";
        product1.price = 1000000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "마우스";
        product2.price = 15000;
        product2.quantity = 3;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "키보드";
        product3.price = 50000;
        product3.quantity = 1;

        ProductOrder[] productOrders = {product1, product2, product3};

        long totalPayment = 0;
        for (ProductOrder productOrder : productOrders) {
            totalPayment += productOrder.price * productOrder.quantity;
            System.out.println(
                    "상품명: " + productOrder.productName + ", " +
                            "가격: " + productOrder.price + "원, " +
                            "수량: " + productOrder.quantity + "개");
        }

        System.out.println("총 결제 금액: " + totalPayment + "원");
    }
}
