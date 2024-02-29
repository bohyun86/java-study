package quiz.quiz2.q4;

public class Warrior extends Character implements Attackable {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack(Character character) {
        System.out.printf("%s이(가) %s을(를) 공격합니다. 강한 공격!\n", this.name, character.name);
    }
}
