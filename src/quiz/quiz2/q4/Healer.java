package quiz.quiz2.q4;

public class Healer extends Character implements Healable {
    public Healer(String name) {
        super(name);
    }

    @Override
    public void heal(Character character) {
        System.out.printf("%s은(는) %s을(를) 치유합니다. 치유의 빛!\n", this.name, character.name);
    }
}
