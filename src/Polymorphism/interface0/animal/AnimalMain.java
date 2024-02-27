package Polymorphism.interface0.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Chicken chicken = new Chicken();
        Dog dog = new Dog();
        Pig pig = new Pig();

        cat.move();
        chicken.move();
        dog.move();
        pig.move();
        

    }

    void sound(Animal animal) {
        animal.sound();
    }


    void move(Animal animal) {
        animal.move();
    }
}
