package Polymorphism.ex.ex3;

public class Circle extends Shape {

    private final double PI = 3.14;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = PI * radius * radius;
        System.out.printf("원의 면적: %.2f", result);
    }
}
