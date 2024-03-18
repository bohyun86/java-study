package lambda.ex;

import java.util.function.Consumer;

public class Person {
    String name;
    int age;
    boolean isAttended = false;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

        Consumer<String> greet = str -> {
            System.out.printf("Welcome, %s!\n", str);
            this.isAttended = this.age >= 18;
        };
        greet.accept(name);

    }


}
