package Polymorphism.ex.ex3;

public class Triangle extends Shape {
    int baseSide;
    int heightSide;

    public Triangle(int baseSide, int heightSide) {
        this.baseSide = baseSide;
        this.heightSide = heightSide;
    }

    @Override
    public void area() {
        double result = baseSide * heightSide / 2.0;
        System.out.printf("삼각형의 면적: %.2f", result);
    }
}
