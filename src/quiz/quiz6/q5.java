package quiz.quiz6;

import java.util.Arrays;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );

        double v = reviews.stream().mapToDouble(n -> n.reputation).average().orElseThrow();
        System.out.println("평균 리뷰 점수: " + v);

        long count = reviews.stream().filter(n -> n.reputation == 5).count();
        System.out.println("5점 리뷰 수: " + count);
    }

}
