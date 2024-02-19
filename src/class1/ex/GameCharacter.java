package class1.ex;

public class GameCharacter {
    String name;
    int level;
    int health;

    GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    void attack(GameCharacter character) {
        System.out.printf("%s가(이) %s를 Attacks!\n", name, character.name);
    }

    void takeDamage(GameCharacter character, int damage) {
        character.health -= damage;
        System.out.printf("%s가(이) %d의 데미지를 입습니다.\n",character.name, damage);
        System.out.printf("%s의 남은 health: %d\n", character.name, character.health);
    }

}
