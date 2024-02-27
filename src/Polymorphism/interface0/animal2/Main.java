package Polymorphism.interface0.animal2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        // Animal을 상속 받은 인스턴스만 가능
        sound(cat);
        sound(sparrow);
        sound(penguin);

        // Flyable을 상속 받은 인스턴스만 가능
        flyable(sparrow);
        flyable(penguin);
    }

    static void sound(Animal animal) {
        animal.sound();
    }

    static void flyable(Flyable flyable) {
        flyable.fly();
    }
}
