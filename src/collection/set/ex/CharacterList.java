package collection.set.ex;

import java.util.HashSet;
import java.util.Set;

public class CharacterList {
    Set<Character> charactersList = new HashSet<>();


    public void addCharacter(Character character) {
        if (charactersList.contains(character)) {
            System.out.printf("(캐릭터의 ID %s 중복됩니다.)\n", character.id);
        } else {
            charactersList.add(character);
        }

    }

    public void printList() {
        for (Character character : charactersList) {
            System.out.printf("캐릭터 정보: ID %s, 이름 %s\n",character.id, character.name);
        }
    }

}
