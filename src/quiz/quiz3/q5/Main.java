package quiz.quiz3.q5;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 2.5, 10);
        Product product2 = new Product("Apple", 2.5, 10);

        boolean equals = product1.equals(product2);
        int hashProduct1 = product1.hashCode();
        int hashProduct2 = product2.hashCode();
        String string1 = product1.toString();
        String string2 = product2.toString();

        System.out.println("eqauls 메서드 호출 결과: " + equals);
        System.out.println("hashCode 메서드 호출 결과 (product1): " + hashProduct1);
        System.out.println("hashCode 메서드 호출 결과 (product2): " + hashProduct2);
        System.out.println("toString 메서드 호출 결과 (product1): " + string1);
        System.out.println("toString 메서드 호출 결과 (product2): " + string2);

    }
}
