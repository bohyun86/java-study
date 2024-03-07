package library.lang.ex.ex3;

import java.util.Objects;

public class Person {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);

        System.out.println(person1.hashCode()); // 318734572
        System.out.println(person2.hashCode()); // 123456789
        System.out.println(person1.equals(person2)); // false
    }


    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}