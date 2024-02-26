package Polymorphism.ex.ex3;

public class Ractangle extends Shape {

    int widthSide;
    int heightSide;


    public Ractangle(int widthSide, int heightSide) {
        this.widthSide = widthSide;
        this.heightSide = heightSide;
    }

    @Override
    public void area() {
        int result = widthSide * heightSide;
        System.out.println("사각형의 면적: " + result);
    }
}
