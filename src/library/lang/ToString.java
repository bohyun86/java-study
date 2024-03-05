package library.lang;

public class ToString {
    public static void main(String[] args) {
        Product product = new Product("참외", 2000,"과일");
        System.out.println(product);
    }
}

class Product {
    private String productName;
    private long price;
    private String category;

    public Product(String productName, long price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
