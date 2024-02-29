package quiz.quiz2.q3;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void area() {
        double result = width * height / 2.0;
        System.out.println("삼각형의 면적 " + result);
    }
}
