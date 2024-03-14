package collection.set.ex;
import java.util.Scanner;

public class Ex5 {
    static CharacterList characterList = new CharacterList();
    public static void main(String[] args) {

    generateCharacter();
    generateCharacter();
    generateCharacter();

    characterList.printList();

    }

    public static void generateCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력: 캐릭터 정보(캐릭터 ID와 이름)");
        System.out.println("===");
        String Id = scanner.nextLine();
        String name = scanner.nextLine();
        characterList.addCharacter(new Character(Id, name));
    }
}
