package Polymorphism.interface0.ex.ex3;

public class Mage extends Character implements Attackable {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.printf("%s이(가) %s에게 공격합니다. 불의 화살!\n", name, character.name);
    }
}
