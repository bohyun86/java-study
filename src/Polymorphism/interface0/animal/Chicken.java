package Polymorphism.interface0.animal;

public class Chicken implements Animal {
    @Override
    public void sound() {
        System.out.println("꼬기오");
    }

    @Override
    public void move() {
        System.out.println("닭이 파다닥 움직입니다.");
    }
}
