package class1.ex;

public class Person {
    String name;
    int age = 0;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person(String name, String gender) {
        this(name,0,gender);
        this.name = name;
        this.gender = gender;
    }

    void printInfo() {
        System.out.printf("이름 : %s, 나이: %d, 성별: %s\n", name, age, gender);
    }
}
