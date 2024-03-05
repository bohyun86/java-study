package library.lang.ex4;

import java.util.Objects;

public class Ex4 {
    public static void main(String[] args) {
        Product product1 = new Product("Apple",2.5,10);
        Product product2 = new Product("Apple",2.5,10);

        System.out.println("equals 메서드 호출 결과: " + product1.equals(product2));


        System.out.println("hashCode 메서드 호출 결과 (product1): " + product1.hashCode());
        System.out.println("hashCode 메서드 호출 결과 (product2): " + product2.hashCode());

        System.out.println("toString 메서드 호출 결과 (product1): " + product1.toString());
        System.out.println("toString 메서드 호출 결과 (product2): " + product2.toString());


    }

}

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "상품: %s, 가격: %.1f, 수량: %d".formatted(name, price, quantity);
    }
}