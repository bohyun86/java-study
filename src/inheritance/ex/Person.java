package inheritance.ex;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.printf("안녕하세요. 제 이름은 %s입니다. 저는 %d살 입니다.\n", name, age);
    }
}
