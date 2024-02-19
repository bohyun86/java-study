package class0.ex;

import java.util.Scanner;

public class Animal {
    String specie;
    String name;
    int age;


    Animal[] animalArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력한 동물수를 적으세요 : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        Animal[] animalArray = new Animal[number];

        for (int i = 0; i < number; i++) {
            System.out.println("동물의 종류, 이름, 나이를 입력하세요 ");
            System.out.print("동물 종: ");
            String s = scanner.nextLine();
            System.out.print("동물 이름: ");
            String n = scanner.nextLine();
            System.out.print("동물 나이 : ");
            int a = scanner.nextInt();
            scanner.nextLine();
            Animal animal = new Animal();
            animal.specie = s;
            animal.name = n;
            animal.age = a;
            animalArray[i] = animal;
        }

        return animalArray;
    }

    void printInfo(Animal[] animals) {
        for (Animal animal:animals) {
            System.out.println("동물의 종 : " + animal.specie + ", 동물의 이름 : " + animal.name + ", 동물의 나이 : " + animal.age);
        }
    }
}
