package class0.ex;

public class Ractangle {
    int width;
    int height;
    int area;

    public Ractangle(int w, int h) {
        width = w;
        height = h;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }


    void printResult() {
        area = calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
