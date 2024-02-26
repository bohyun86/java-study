package Polymorphism.ex.ex3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Ractangle ractangle = new Ractangle(4,6);
        Triangle triangle = new Triangle(4,6);

        circle.area();
        ractangle.area();
        triangle.area();


    }
}
