package quiz.quiz2.q3;

import Polymorphism.ex.ex3.Ractangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.area();

        Ractangle ractangle = new Ractangle(3,4);
        ractangle.area();

        Triangle triangle = new Triangle(3,5);
        triangle.area();
    }
}
