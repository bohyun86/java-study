package Polymorphism.interface0.animal;

public class Pig implements Animal {
    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void move() {
        System.out.println("돼지가 뒤뚱뒤뚱 움직입니다.");
    }
}
