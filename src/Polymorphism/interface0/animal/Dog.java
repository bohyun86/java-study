package Polymorphism.interface0.animal;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 빨빨 움직입니다.");
    }
}
