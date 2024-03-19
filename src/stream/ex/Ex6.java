package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, 250),
                new Product("Smartphone", 499.99, 300),
                new Product("Tablet", 199.99, 300),
                new Product("Smartwatch", 199.99, 150)
        );

        products.stream().
                sorted(Comparator.comparing(Product::getReviews).reversed()
                        .thenComparing(Comparator.comparing(Product::getPrice)))
                .forEach(System.out::println);

    }
}
