package Polymorphism.abstraction.pure;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();
        Tiger tiger = new Tiger();

        sound(cat);
        sound(dog);
        sound(mouse);
        sound(tiger);

        move(cat);
        move(dog);
        move(mouse);
        move(tiger);
    }

    // 스테틱 메서드
    // 동물이 추가되어도 코드가 변경되지 않는다
    // 실행 로직, 구현부는 전혀 가지고 있지 않고, 껍데기 역할만 제공

    static void sound(Animal animal) {
        animal.sound();
    }

    static void move(Animal animal) {
        animal.move();
    }
}
