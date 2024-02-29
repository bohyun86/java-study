package quiz.quiz2.q3;

public class Circle extends Shape{

    final private double PI = 3.14159;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = PI * radius * radius;
        System.out.printf("원의 면적: %.1f\n", result);
    }
}
