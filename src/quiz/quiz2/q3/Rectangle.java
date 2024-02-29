package quiz.quiz2.q3;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void area() {
        int result = width * height;
        System.out.println("사각형의 면적: " + result);
    }
}
